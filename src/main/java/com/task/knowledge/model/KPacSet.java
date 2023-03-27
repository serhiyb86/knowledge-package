package com.task.knowledge.model;

import java.util.Objects;
import java.util.Set;

/**
 * K-PAC Set is an entity that can contain multiple K-PAC entities. It contains the next fields:
 * ● ID - unique numeric field, the occurrence of the K-PAC Set.
 * ● Title - a character string (up to 250 characters).
 */
public class KPacSet {
    private long setId;
    private String title;
    private Set<KPac> KPacs;

    public KPacSet(long setId, String title, Set<KPac> KPacs) {
        this.setId = setId;
        this.title = title;
        this.KPacs = KPacs;
    }

    public KPacSet() {
    }

    public long getSetId() {
        return setId;
    }

    public void setSetId(long setId) {
        this.setId = setId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<KPac> getKPacs() {
        return KPacs;
    }

    public void setKPacs(Set<KPac> KPacs) {
        this.KPacs = KPacs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KPacSet that = (KPacSet) o;
        return setId == that.setId && Objects.equals(title, that.title) && Objects.equals(KPacs, that.KPacs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(setId, title, KPacs);
    }

    @Override
    public String toString() {
        return "KPacSetModel{" +
                "id=" + setId +
                ", title='" + title + '\'' +
                ", KPacs=" + KPacs +
                '}';
    }
}
