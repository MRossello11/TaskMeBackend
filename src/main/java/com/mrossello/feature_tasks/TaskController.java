package com.mrossello.feature_tasks;

import com.mrossello.feature_tasks.domain.Task;
import com.mrossello.feature_tasks.domain.TaskRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tasks")
public class TaskController {
    private final TaskRepository taskRepository;

    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return taskRepository.getAllTasks();
    }

    @PostMapping
    public int createTask(@RequestBody Task task) {
        taskRepository.createTask(task);
        return 0;
    }

    @PutMapping
    public int updateTask(@RequestBody Task task) {
        taskRepository.updateTask(task);
        return 0;
    }

    @DeleteMapping("{id}")
    public int deleteTask(@PathVariable String id) {
        taskRepository.deleteTask(id);
        return 0;
    }
}
