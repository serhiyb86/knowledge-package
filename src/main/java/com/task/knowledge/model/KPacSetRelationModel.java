package com.task.knowledge.model;

import java.util.Objects;

public class KPacSetRelationModel {
    private long id;
    private KPacMainModel kPac;
    private KPacSetModel kPacSet;

    public KPacSetRelationModel(long id, KPacMainModel kPac, KPacSetModel kPacSet) {
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

    public KPacMainModel getkPac() {
        return kPac;
    }

    public void setkPac(KPacMainModel kPacMainModel) {
        kPac = kPacMainModel;
    }

    public KPacSetModel getkPacSet() {
        return kPacSet;
    }

    public void setkPacSet(KPacSetModel kPacSet) {
        this.kPacSet = kPacSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KPacSetRelationModel that = (KPacSetRelationModel) o;
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
