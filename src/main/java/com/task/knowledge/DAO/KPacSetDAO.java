package com.task.knowledge.DAO;

import com.task.knowledge.model.KPacSet;

import java.util.List;

public interface KPacSetDAO {
    List<KPacSet> setsAll();
    List<KPacSet> setsByKpacId(long kpacId);
    KPacSet createSet(KPacSet kPacSet);
    KPacSet setById(long setId);
    boolean deleteSet(long setId);
}
