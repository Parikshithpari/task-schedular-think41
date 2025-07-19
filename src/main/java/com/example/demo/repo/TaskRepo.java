package com.example.demo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.enums.Status_of_task;
import com.example.demo.model.Task;

@Repository
public interface TaskRepo extends JpaRepository<Task, Long>
{

	Optional<Task> findByStatus(Status_of_task pending);

}
