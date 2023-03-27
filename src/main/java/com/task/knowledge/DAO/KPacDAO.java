package com.task.knowledge.DAO;

import com.task.knowledge.model.DTO.KPacDTOCreateObject;
import com.task.knowledge.model.DTO.ListKPacsForSetDTOObject;
import com.task.knowledge.model.KPac;
import com.task.knowledge.model.KPacSet;


import java.util.List;

public interface KPacDAO {



    List<KPac> kpacsAll();
    ListKPacsForSetDTOObject kpacsBySetId(long setId);

    KPac createKPac(KPacDTOCreateObject kPacDTOCreateObject);
    boolean deleteKPac(long kpacId);

}
