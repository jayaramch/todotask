package com.todo.tasks.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.todo.tasks.dto.TaskStatus;
import com.todo.tasks.dto.TasksDto;
import com.todo.tasks.model.Tasks;
import com.todo.tasks.repository.TaskRepository;
import com.todo.tasks.service.ITasksService;

@RestController
public class TasksController {

	@Autowired
	private TaskRepository taskRepository;
	@Autowired
	private ITasksService ITasksService;
	@Autowired
	private HttpServletRequest request;

	@RequestMapping(value = "/getAllTasks", method = RequestMethod.GET)
	public List<TasksDto> getAllTasks() {
		
		return ITasksService.getAllTasks();
	}
	@RequestMapping(value = "/getTaskStatus", method = RequestMethod.GET)
	public TaskStatus getTaskStatus(){
		return ITasksService.getTaskStatus();
	}
	@RequestMapping(value = "/markComplete", method = RequestMethod.PUT)
	public String markComplete() {
		ITasksService.updateTask(Integer.valueOf(request.getParameter("taskId")));
		return JSONObject.quote("Mark Completed Successfully");
	}

	@RequestMapping(value = "/saveTask", method = RequestMethod.POST)
	public String saveTask(@RequestBody Tasks task) {
		taskRepository.save(task);
		return JSONObject.quote("Task Saved Successfully");
	}

	@RequestMapping(value = "/deleteTask", method = RequestMethod.PUT)
	public String deleteTask() {
		ITasksService.deleteTask(Integer.valueOf(request.getParameter("taskId")));
		return JSONObject.quote("Mark Completed Successfully");
	}
}
