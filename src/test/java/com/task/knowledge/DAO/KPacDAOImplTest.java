package com.task.knowledge.DAO;


import com.mysql.cj.xdevapi.JsonArray;
import com.mysql.cj.xdevapi.JsonParser;
import com.task.knowledge.model.DTO.KPacDTOCreateObject;
import com.task.knowledge.model.DTO.ListKPacsForSetDTOObject;
import com.task.knowledge.model.KPac;
import com.task.knowledge.model.KPacSet;
import com.task.knowledge.util.DateSupport;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.List;

@Ignore
public class KPacDAOImplTest {

    private KPacDAO kPacDAO;
    @Before
    public void setUp() throws Exception {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/kpac_db");
        dataSource.setUsername("kpac");
        dataSource.setPassword("3N~2b-eNj6");
        kPacDAO = new KPacDAOImpl(dataSource);
    }
//
//    @Test
//    public void kpacSetsAll() {
//        for (KPacSet kPacSet : kPacDAO.setsAll()) {
//            System.out.println(kPacSet);
//        }
//
//    }
//
//    @Test
//    public void kpacSetsByKpacId() {
//    }
//
//    @Test
//    public void kpacsAll() {
//    }
//
//    @Test
//    public void createKpacSet() {
//        KPacSet kPacSet = new KPacSet();
//        kPacSet.setTitle("Transportation");
//        KPacSet kpacSet = kPacDAO.createSet(kPacSet);
//        System.out.println(kpacSet);
//    }
//
//    @Test
//    public void createKPac() {
//        KPacDTOCreateObject kpacDTO = new KPacDTOCreateObject();
//        kpacDTO.setTitle("Hello world");
//        kpacDTO.setDescription("This new creature with the long hair is a good deal in the way. It is always\n" +
//                "hanging around and following me about. I don't like this; I am not used to\n" +
//                "company. I wish it would stay with the other animals. Cloudy to-day, wind in\n" +
//                "the east; think we shall have rain.... Where did I get that word?... I remember\n" +
//                "now —the new creature uses it.\n");
//        kpacDTO.setCreationDate(DateSupport.getCurrentDate());
//        kpacDTO.setKpacSetId(9);
//        KPac kPac = kPacDAO.createKPac(kpacDTO);
//        System.out.println(kPac);
//    }
//
//    @Test
//    public void getKPacSetById() {
//// YYYY-MM-DD - mysql format
//        String PATTERN = "dd-MM-yyyy";
//
//      //  System.out.println(Date.valueOf("12-01-2022"));
//        System.out.println(DateSupport.toDateMysqlFormat("12-01-2022"));
//    }
//
//    @Test
//    public void setsAll() {
//    }
//
//    @Test
//    public void setsByKpacId() {
//    }
//
    @Test
    public void testKpacsAll() {
        List<KPac> kPacs = kPacDAO.kpacsAll();

        System.out.println(new JSONArray(kPacs));
        for (KPac kPac : kPacs) {

        }


//        for (KPac kPac : kPacs) {
//            JSONObject jsonObject = new JSONObject(kPac);
//            jsonArray..put(jsonObject)
//            System.out.println(kPac);
//        }
        JSONArray ja = new JSONArray();
        ja.put(Boolean.TRUE);
        ja.put("lorem ipsum");

        JSONObject jo = new JSONObject();
        jo.put("name", "jon doe");
        jo.put("age", "22");
        jo.put("city", "chicago");

        ja.put(jo);

    }
//
//    @Test
//    public void kpacsBySetId() {
//        ListKPacsForSetDTOObject pacs = kPacDAO.kpacsBySetId(9);
//        System.out.println(pacs);
//    }
//
//    @Test
//    public void createSet() {
//    }
//
//    @Test
//    public void testCreateKPac() {
//    }
//
//    @Test
//    public void setById() {
//        KPacSet kPacSet = kPacDAO.setById(9);
//        System.out.println(kPacSet);
//    }
}