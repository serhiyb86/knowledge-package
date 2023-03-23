package com.task.knowledge.model;

import java.util.Objects;
import java.util.Set;

/**
 * K-PAC Set is an entity that can contain multiple K-PAC entities. It contains the next fields:
 * ● ID - unique numeric field, the occurrence of the K-PAC Set.
 * ● Title - a character string (up to 250 characters).
 */
public class KPacSetModel {
    private long id;
    private String title;
    private Set<KPacMainModel> KPacs;

    public KPacSetModel(long id, String title, Set<KPacMainModel> KPacs) {
        this.id = id;
        this.title = title;
        this.KPacs = KPacs;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<KPacMainModel> getKPacs() {
        return KPacs;
    }

    public void setKPacs(Set<KPacMainModel> KPacs) {
        this.KPacs = KPacs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KPacSetModel that = (KPacSetModel) o;
        return id == that.id && Objects.equals(title, that.title) && Objects.equals(KPacs, that.KPacs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, KPacs);
    }

    @Override
    public String toString() {
        return "KPacSetModel{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", KPacs=" + KPacs +
                '}';
    }
}
