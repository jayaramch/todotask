package com.todo.tasks.dto;

import java.io.Serializable;

public class TasksDto implements Serializable {
	private Integer taskId;
	private String taskName;
	private boolean isMarkComplete;

	public TasksDto(Integer taskId, String taskName, boolean isMarkComplete) {
		super();
		this.taskId = taskId;
		this.taskName = taskName;
		this.isMarkComplete = isMarkComplete;
	}

	public TasksDto() {
		super();
	}

	public Integer getTaskId() {
		return taskId;
	}

	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public boolean isMarkComplete() {
		return isMarkComplete;
	}

	public void setMarkComplete(boolean isMarkComplete) {
		this.isMarkComplete = isMarkComplete;
	}

}
