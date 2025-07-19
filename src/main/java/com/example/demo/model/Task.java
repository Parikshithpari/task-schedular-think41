package com.example.demo.model;

import java.sql.Time;

import com.example.demo.enums.Status_of_task;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Task 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long internal_db_id;
	private String task_Str_id;
	private String description;
	private int estimated_time_in_minutes;
	
	Time sqlTime = new Time(estimated_time_in_minutes * 60 * 1000);

	
	@Enumerated(EnumType.STRING)
	private Status_of_task status;
	
	public Task(Long internal_db_id, String task_Str_id, String description, int estimated_time_in_minutes,
			Status_of_task status) {
		super();
		this.internal_db_id = internal_db_id;
		this.task_Str_id = task_Str_id;
		this.description = description;
		this.estimated_time_in_minutes = estimated_time_in_minutes;
		this.status = status;
	}
	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getInternal_db_id() {
		return internal_db_id;
	}
	public void setInternal_db_id(Long internal_db_id) {
		this.internal_db_id = internal_db_id;
	}
	public String getTask_Str_id() {
		return task_Str_id;
	}
	public void setTask_Str_id(String task_Str_id) {
		this.task_Str_id = task_Str_id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getEstimated_time_in_minutes() {
		return estimated_time_in_minutes;
	}
	public void setEstimated_time_in_minutes(int estimated_time_in_minutes) {
		this.estimated_time_in_minutes = estimated_time_in_minutes;
	}
	public Status_of_task getStatus() {
		return status;
	}
	public void setStatus(Status_of_task status) {
		this.status = status;
	}
}