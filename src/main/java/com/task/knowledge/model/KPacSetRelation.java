package com.task.knowledge.model;

import java.util.Objects;

public class KPacSetRelation {
    private long id;
    private KPac kPac;
    private KPacSet kPacSet;

    public KPacSetRelation(long id, KPac kPac, KPacSet kPacSet) {
        this.id = id;
        this.kPac = kPac;
        this.kPacSet = kPacSet;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public KPac getkPac() {
        return kPac;
    }

    public void setkPac(KPac kPac) {
        this.kPac = kPac;
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
        KPacSetRelation that = (KPacSetRelation) o;
        return id == that.id && Objects.equals(kPac, that.kPac) && Objects.equals(kPacSet, that.kPacSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, kPac, kPacSet);
    }

    @Override
    public String toString() {
        return "KPacSetRelationModel{" +
                "id=" + id +
                ", kPac=" + kPac +
                ", kPacSet=" + kPacSet +
                '}';
    }
}
