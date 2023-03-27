package com.task.knowledge.model.DTO;

import com.task.knowledge.model.KPac;
import com.task.knowledge.model.KPacSet;

import java.util.List;
import java.util.Objects;

public class ListKPacsForSetDTOObject {
    private List<KPac> kPacs;
    private KPacSet kPacSet;

    public List<KPac> getkPacs() {
        return kPacs;
    }

    public void setkPacs(List<KPac> kPacs) {
        this.kPacs = kPacs;
    }

    public KPacSet getkPacSet() {
        return kPacSet;
    }

    public void setkPacSet(KPacSet kPacSet) {
        this.kPacSet = kPacSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListKPacsForSetDTOObject that = (ListKPacsForSetDTOObject) o;
        return Objects.equals(kPacs, that.kPacs) && Objects.equals(kPacSet, that.kPacSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kPacs, kPacSet);
    }

    @Override
    public String toString() {
        return "ListKPacsForSetDTOObject{" +
                "kPacs=" + kPacs +
                ", kPacSet=" + kPacSet +
                '}';
    }
}
