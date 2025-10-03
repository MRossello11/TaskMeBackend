package com.mrossello.feature_tasks.domain;

import com.mrossello.feature_tasks.data.TaskEntity;

import java.util.List;

public interface TaskRepository {
    List<Task> getAllTasks();
    void createTask(Task task);
    void updateTask(Task task);
    void deleteTask(String id);

    default Task toDomain(TaskEntity entity) {
        return new Task(
                entity.getId(),
                entity.getTitle(),
                entity.getCreatedAt(),
                entity.isCompleted()
        );
    }

    default TaskEntity toEntity(Task task) {
        return new TaskEntity(
                task.getId(),
                task.getTitle(),
                task.getCreatedAt(),
                task.isCompleted()
        );
    }
}
