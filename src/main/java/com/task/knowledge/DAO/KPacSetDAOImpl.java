package com.task.knowledge.DAO;

import com.task.knowledge.model.KPacSet;

import javax.sql.DataSource;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;


public class KPacSetDAOImpl implements KPacSetDAO {
    private static final String KPAC_SET_GET_QUERY = "select * from kpac_set limit 1000";//todo pageble
    private static final String KPAC_SET_BY_ID_GET_QUERY = "select * from kpac_set where id=?";
    private static final String KPAC_SETS_BY_KPAC_ID_GET_QUERY = "select * from kpac_set limit 1000";//todo pageble
    private static final String KPAC_SET_DELETE_QUERY = "delete from kpac_set where id=?";
    private static final String KPAC_SET_CREATE_QUERY = "INSERT INTO kpac_set (title) VALUES (?);";
    private DataSource dataSource;

    public KPacSetDAOImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<KPacSet> setsAll() {
        List<KPacSet> sets = new LinkedList<>();
        try (Connection con = dataSource.getConnection()) {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(KPAC_SET_GET_QUERY);
            while (rs.next()) {
                KPacSet set = new KPacSet();
                set.setSetId(rs.getLong("id"));
                set.setTitle(rs.getString("title"));
                sets.add(set);
            }
        } catch (SQLException e) {
            System.out.println("Exception during retrieving kpacs..");
        }
        return sets;
    }

    @Override
    public List<KPacSet> setsByKpacId(long kpacId) {
        return null;
    }

    @Override
    public KPacSet setById(long setId) {
        try (Connection con = dataSource.getConnection()) {
            PreparedStatement st = con.prepareStatement(KPAC_SET_BY_ID_GET_QUERY);
            st.setLong(1, setId);
            ResultSet rs = st.executeQuery();
            KPacSet set = new KPacSet();
            while (rs.next()) {
                set.setSetId(rs.getLong("id"));
                set.setTitle(rs.getString("title"));
            }
            return set;
        } catch (SQLException e) {
            System.out.println("Exception during retrieving set..");
        }
        return null;
    }

    @Override
    public boolean deleteSet(long setId) {
        return false;
    }

    @Override
    public KPacSet createSet(KPacSet kPacSet) {
        //todo create with kpacs
        try (Connection con = dataSource.getConnection()) {
            PreparedStatement ps = con.prepareStatement(KPAC_SET_CREATE_QUERY, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, kPacSet.getTitle());
            int i = ps.executeUpdate();
            if (i == 0) {
                throw new SQLException("Creating kPacSets failed, no rows were inserted.");
            }
            System.out.println(i + " rows was/were created.");
            try (ResultSet generatedKeys = ps.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    kPacSet.setSetId(generatedKeys.getLong(1));
                    return kPacSet;
                } else {
                    throw new SQLException("Creating kPacSets failed, no ID obtained.");
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
