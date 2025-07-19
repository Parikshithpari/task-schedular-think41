package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.enums.Status_of_task;
import com.example.demo.model.Task;
import com.example.demo.repo.TaskRepo;

@Service
public class TaskService 
{
	@Autowired
	private TaskRepo repo;

	private Status_of_task status;
	
	public Task scheduleTask(Task task)
	{
		if(repo.findByStatus(Status_of_task.PENDING).isPresent())
		{
			throw new RuntimeException("There is a task which is running already");
		}
			task.setStatus(status.PENDING);
			if(task.getEstimated_time_in_minutes() == 0)
			{
				task.setStatus(status.COMPLETED);
			}
			return repo.save(task);
	}
	
	public Optional<Task> getTaskByInternalDBId(Long internal_db_id)
	{
		return repo.findById(internal_db_id);
	}
}
