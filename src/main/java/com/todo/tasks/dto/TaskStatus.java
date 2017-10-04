package com.todo.tasks.dto;

import java.io.Serializable;

public class TaskStatus implements Serializable {
	private Integer pendingTasks;
	private Integer completedTasks;

	public Integer getPendingTasks() {
		return pendingTasks;
	}

	public void setPendingTasks(Integer pendingTasks) {
		this.pendingTasks = pendingTasks;
	}

	public Integer getCompletedTasks() {
		return completedTasks;
	}

	public void setCompletedTasks(Integer completedTasks) {
		this.completedTasks = completedTasks;
	}

}
