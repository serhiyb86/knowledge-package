package com.task.knowledge.DAO;

import com.task.knowledge.model.DTO.KPacDTOCreateObject;
import com.task.knowledge.model.DTO.ListKPacsForSetDTOObject;
import com.task.knowledge.model.KPac;
import com.task.knowledge.model.KPacSet;
import com.task.knowledge.util.DateSupport;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class KPacDAOImpl implements KPacDAO {
    private static final String KPAC_CREATE_QUERY = "INSERT INTO k_pac (title, description, creation_date) VALUES (?,?,?);";
    private static final String KPAC_SET_RELATION_CREATE_QUERY = "INSERT INTO kpac_set_relation (kpacs, sets) VALUES (?, ?);";
    private static final String KPAC_DELETE_QUERY = "delete from k_pac where id=?";
    private static final String KPAC_GET_QUERY = "select * from k_pac limit 1000";//todo pageble
    private static final String KPACS_BY_KPAC_SET_ID_GET_QUERY = "select k_pac.id, k_pac.title, k_pac.description, k_pac.creation_date, kpac_set.id as set_id, kpac_set.title as set_title from k_pac \n" +
            "join kpac_set_relation \n" +
            "on k_pac.id=kpac_set_relation.kpacs \n" +
            "join kpac_set \n" +
            "on kpac_set_relation.sets=kpac_set.id where kpac_set.id=?";


    private final DataSource dataSource;


    public KPacDAOImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    @Override
    public List<KPac> kpacsAll() {
        List<KPac> kPacs = new LinkedList<>();
        try (Connection con = dataSource.getConnection()) {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(KPAC_GET_QUERY);
            while (rs.next()) {
                KPac kPac = new KPac();
                kPac.setIdKPac(rs.getLong("id"));
                kPac.setTitle(rs.getString("title"));
                kPac.setDescription(rs.getString("description"));
                kPac.setCreationDate(DateSupport.fromDateMysqlFormat(rs.getDate("creation_date")));
                kPacs.add(kPac);
            }
        } catch (SQLException e) {
            System.err.println("Exception during retrieving kpacs..");
        }
        return kPacs;
    }

    @Override
    public ListKPacsForSetDTOObject kpacsBySetId(long setId) {
        ListKPacsForSetDTOObject kpacDTO = new ListKPacsForSetDTOObject();
        List<KPac> kPacs = new LinkedList<>();
        try (Connection con = dataSource.getConnection()) {
            PreparedStatement ps = con.prepareStatement(KPACS_BY_KPAC_SET_ID_GET_QUERY);
            ps.setLong(1, setId);
            KPacSet kPacSet = new KPacSet();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KPac kPac = new KPac();
                kPac.setIdKPac(rs.getLong("id"));
                kPac.setTitle(rs.getString("title"));
                kPac.setDescription(rs.getString("description"));
                kPac.setCreationDate(DateSupport.fromDateMysqlFormat(rs.getDate("creation_date")));
                kPacs.add(kPac);
                kPacSet.setTitle(rs.getString("set_title"));
            }
            kPacSet.setSetId(setId);
            kpacDTO.setkPacSet(kPacSet);
            kpacDTO.setkPacs(kPacs);
            return kpacDTO;
        } catch (SQLException e) {
            System.out.println("Exception during retrieving kpacs..");
        }
        return null;
    }

    @Override
    public KPac createKPac(KPacDTOCreateObject kPac) {
        KPac kPacReturn = new KPac();
        try (Connection con = dataSource.getConnection()) {
            PreparedStatement ps = con.prepareStatement(KPAC_CREATE_QUERY, Statement.RETURN_GENERATED_KEYS);
            con.setAutoCommit(false);
            ps.setString(1, kPac.getTitle());
            ps.setString(2, kPac.getDescription());
            ps.setDate(3, DateSupport.toDateMysqlFormat(kPac.getCreationDate()));
            int i = ps.executeUpdate();
            if (i == 0) {
                throw new SQLException("Creating kPac failed, no rows were inserted.");
            }
            long kpacId;
            try (ResultSet generatedKeys = ps.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    kpacId = generatedKeys.getLong(1);
                    kPacReturn.setIdKPac(kpacId);

                } else {
                    throw new SQLException("Creating kPac failed, no ID obtained.");
                }
            }
            PreparedStatement ps2 = con.prepareStatement(KPAC_SET_RELATION_CREATE_QUERY);
            ps2.setLong(1, kpacId);
            ps2.setLong(2, kPac.getKpacSetId());
            int i1 = ps2.executeUpdate();
            if (i1 == 0) {
                throw new SQLException("Creating kPac relation was failed, no rows were inserted.");
            }
            con.commit();
            kPacReturn.setDescription(kPac.getDescription());
            kPacReturn.setTitle(kPac.getTitle());
            kPacReturn.setCreationDate(kPac.getCreationDate());
        } catch (SQLException e) {
            System.out.println("Exception during performing transaction was occurred. Rollback....");
            throw new RuntimeException(e);
        }
        return kPacReturn;
    }

    @Override
    public boolean deleteKPac(long kpacId) {
        try (Connection con = dataSource.getConnection()) {
            PreparedStatement st = con.prepareStatement(KPAC_DELETE_QUERY);
            st.setLong(1, kpacId);
            int i = st.executeUpdate();
            return i == 1;
        } catch (SQLException e) {
            System.out.println("Exception during deleting kpac: " + kpacId);
        }
        return false;
    }


}
