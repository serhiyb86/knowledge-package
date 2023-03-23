package com.task.knowledge.model;

import java.util.Objects;
import java.util.Set;

public class KPacMainModel {

    private long id;
    private String title;
    private String Description;
    private String creationDate;//format DD-MM-YYYY
    private Set<KPacSetModel> KPacSets;

    public KPacMainModel(long id, String title, String description, String creationDate, Set<KPacSetModel> KPacSets) {
        this.id = id;
        this.title = title;
        Description = description;
        this.creationDate = creationDate;
        this.KPacSets = KPacSets;
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

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public Set<KPacSetModel> getKPacSets() {
        return KPacSets;
    }

    public void setKPacSets(Set<KPacSetModel> KPacSets) {
        this.KPacSets = KPacSets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KPacMainModel kPacMainModel = (KPacMainModel) o;
        return id == kPacMainModel.id && Objects.equals(title, kPacMainModel.title) && Objects.equals(Description, kPacMainModel.Description) && Objects.equals(creationDate, kPacMainModel.creationDate) && Objects.equals(KPacSets, kPacMainModel.KPacSets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, Description, creationDate, KPacSets);
    }

    @Override
    public String toString() {
        return "KPacModel{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", Description='" + Description + '\'' +
                ", creationDate='" + creationDate + '\'' +
                ", KPacSets=" + KPacSets +
                '}';
    }
}
