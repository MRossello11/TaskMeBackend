package com.mrossello.feature_tasks.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class TaskEntity {

    @Id
    private String id;
    private String title;
    private Long createdAt;
    private boolean completed;

    public TaskEntity() {
    }

    public TaskEntity(String id, String title, Long createdAt, boolean completed) {
        this.id = id;
        this.title = title;
        this.createdAt = createdAt;
        this.completed = completed;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TaskEntity task = (TaskEntity) o;
        return completed == task.completed && Objects.equals(id, task.id) && Objects.equals(title, task.title) && Objects.equals(createdAt, task.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, createdAt, completed);
    }
}
