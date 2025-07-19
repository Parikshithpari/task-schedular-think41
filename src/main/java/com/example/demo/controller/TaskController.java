package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Task;
import com.example.demo.service.TaskService;

@RestController
public class TaskController 
{
	@Autowired
	private TaskService service;
	
	@PostMapping("/scheduleTask")
	public Task scheduleTask(@RequestBody Task task)
	{
		return service.scheduleTask(task);
	}
	
	@GetMapping("/getTask/{internal_db_id}")
	public Optional<Task> getTheTask(@PathVariable Long internal_db_id)
	{
		return service.getTaskByInternalDBId(internal_db_id);
	}
}
