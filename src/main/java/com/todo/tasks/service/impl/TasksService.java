package com.todo.tasks.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.tasks.dao.ITasksDAO;
import com.todo.tasks.dto.TaskStatus;
import com.todo.tasks.dto.TasksDto;
import com.todo.tasks.service.ITasksService;

@Service
public class TasksService implements ITasksService{
	
	@Autowired
	private ITasksDAO ITasksDAO;
	
	@Override
	public List<TasksDto> getAllTasks() {
		// TODO Auto-generated method stub
		return ITasksDAO.getAllTasks();
	}

	@Override
	public String updateTask(Integer taskId) {
		// TODO Auto-generated method stub
		return ITasksDAO.updateTask(taskId);
	}

	@Override
	public String deleteTask(Integer taskId) {
		// TODO Auto-generated method stub
		return ITasksDAO.deleteTask(taskId);
	}

	@Override
	public TaskStatus getTaskStatus() {
		// TODO Auto-generated method stub
		return ITasksDAO.getTaskStatus();
	}

}
