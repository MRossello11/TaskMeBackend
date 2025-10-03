package com.mrossello;

import com.mrossello.feature_tasks.data.TaskJPARepository;
import com.mrossello.feature_tasks.data.TaskPostgreRepositoryImplementation;
import com.mrossello.feature_tasks.domain.TaskRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TaskMeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskMeApplication.class, args);
	}

    @Bean
    public TaskRepository taskRepository(TaskJPARepository taskJPARepository) {
        return new TaskPostgreRepositoryImplementation(taskJPARepository);
    }
}
