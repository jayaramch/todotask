package com.todo.tasks.service;

import java.util.List;

import com.todo.tasks.dto.TaskStatus;
import com.todo.tasks.dto.TasksDto;


public interface ITasksService {
	public List<TasksDto> getAllTasks();
	public String updateTask(Integer taskId);
	public String deleteTask(Integer taskId);
	public TaskStatus getTaskStatus();
}
