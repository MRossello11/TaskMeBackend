package com.mrossello.data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskJPARepository extends JpaRepository<TaskEntity, String> {}
