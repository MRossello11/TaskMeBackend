package com.mrossello;

import com.mrossello.data.TaskJPARepository;
import com.mrossello.data.TaskPostgreRepositoryImplementation;
import com.mrossello.domain.TaskRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
