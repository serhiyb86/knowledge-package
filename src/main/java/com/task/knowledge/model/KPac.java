package com.task.knowledge.model;

import java.util.Objects;
import java.util.Set;

public class KPac {

    private long idKPac;
    private String title;
    private String description;
    private String creationDate;//format DD-MM-YYYY
    private Set<KPacSet> KPacSets;

    public KPac(long idKPac, String title, String description, String creationDate, Set<KPacSet> KPacSets) {
        this.idKPac = idKPac;
        this.title = title;
        this.description = description;
        this.creationDate = creationDate;
        this.KPacSets = KPacSets;
    }

    public KPac() {
    }

    public long getIdKPac() {
        return idKPac;
    }

    public void setIdKPac(long idKPac) {
        this.idKPac = idKPac;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public Set<KPacSet> getKPacSets() {
        return KPacSets;
    }

    public void setKPacSets(Set<KPacSet> KPacSets) {
        this.KPacSets = KPacSets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KPac kPac = (KPac) o;
        return idKPac == kPac.idKPac && Objects.equals(title, kPac.title) && Objects.equals(description, kPac.description) && Objects.equals(creationDate, kPac.creationDate) && Objects.equals(KPacSets, kPac.KPacSets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idKPac, title, description, creationDate, KPacSets);
    }

    @Override
    public String toString() {
        return "{" +
                "id:" + "\'" + idKPac +"\'"+
                ", title:'" + title + '\'' +
                ", description:'" + description + '\'' +
                ", creationDate:'" + creationDate + '\'' +
                ", KPacSets:" + KPacSets +
                '}';
    }
}
