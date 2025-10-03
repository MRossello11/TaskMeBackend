package com.mrossello.feature_tasks.data;

import com.mrossello.feature_tasks.domain.Task;
import com.mrossello.feature_tasks.domain.TaskRepository;

import java.util.List;

public class TaskPostgreRepositoryImplementation implements TaskRepository {

    private TaskJPARepository taskJPARepository;

    public TaskPostgreRepositoryImplementation(TaskJPARepository taskJPARepository) {
        this.taskJPARepository = taskJPARepository;
    }

    @Override
    public List<Task> getAllTasks() {
        return taskJPARepository.findAll().stream().map(this::toDomain).toList();
    }

    @Override
    public void createTask(Task task) {
        taskJPARepository.save(toEntity(task));
    }

    @Override
    public void updateTask(Task task) {
        taskJPARepository.save(toEntity(task));
    }

    @Override
    public void deleteTask(String id) {
        taskJPARepository.deleteById(id);
    }
}
