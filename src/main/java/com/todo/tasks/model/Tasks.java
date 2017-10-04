package com.todo.tasks.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tasks implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Tasks(Integer taskId, String taskName) {
		super();
		this.taskId = taskId;
		this.taskName = taskName;
	}

	public Tasks() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "task_id")
	private Integer taskId;
	@Column(name = "task_name")
	private String taskName;
	@Column(name = "is_mark_complete")
	private boolean isMarkComplete;

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
