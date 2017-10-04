package com.todo.tasks.dao;

import java.util.List;

import com.todo.tasks.dto.TaskStatus;
import com.todo.tasks.dto.TasksDto;

public interface ITasksDAO {
	public List<TasksDto> getAllTasks();
	public String updateTask(Integer taskId);
	public String deleteTask(Integer taskId);
	public TaskStatus getTaskStatus();
}
