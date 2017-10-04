package com.todo.tasks.util;


import com.todo.tasks.dto.TasksDto;
import com.todo.tasks.model.Tasks;

public class CommonUtil {
	public static TasksDto modelToDto(Tasks task){
		return new TasksDto(task.getTaskId(),task.getTaskName(),task.isMarkComplete());
	}
}
