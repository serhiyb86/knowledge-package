package com.task.knowledge.model.DTO;

import java.util.Objects;

public class KPacDTOCreateObject {
    private long kpacSetId;
    private String title;
    private String description;
    private String creationDate;

    public long getKpacSetId() {
        return kpacSetId;
    }

    public void setKpacSetId(long kpacSetId) {
        this.kpacSetId = kpacSetId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KPacDTOCreateObject that = (KPacDTOCreateObject) o;
        return kpacSetId == that.kpacSetId && Objects.equals(title, that.title) && Objects.equals(description, that.description) && Objects.equals(creationDate, that.creationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kpacSetId, title, description, creationDate);
    }

    @Override
    public String toString() {
        return "KPacDTOCreateObject{" +
                "kpacSetId=" + kpacSetId +
                ", title='" + title + '\'' +
                ", Description='" + description + '\'' +
                ", creationDate='" + creationDate + '\'' +
                '}';
    }
}
