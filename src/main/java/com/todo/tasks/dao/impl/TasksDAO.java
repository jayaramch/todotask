package com.todo.tasks.dao.impl;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.todo.tasks.dao.ITasksDAO;
import com.todo.tasks.dto.TaskStatus;
import com.todo.tasks.dto.TasksDto;
import com.todo.tasks.model.Tasks;
import com.todo.tasks.util.CommonUtil;

@Transactional
@Repository
public class TasksDAO implements ITasksDAO{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<TasksDto> getAllTasks() {
		// TODO Auto-generated method stub
		String hql = "FROM Tasks";
		List<Tasks> taskList = entityManager.createQuery(hql).getResultList();
		List<TasksDto> tastsDto = taskList.stream()
					.map(task -> CommonUtil.modelToDto(task))
					.collect(Collectors.toList());
					
		return tastsDto;
	}

	@Override
	public TaskStatus getTaskStatus() {
		// TODO Auto-generated method stub
		String hql = "FROM Tasks";
		List<Tasks> taskList = entityManager.createQuery(hql).getResultList();
		int completedTasks = (int) taskList.stream().filter(task  -> task.isMarkComplete())
				.count();
//		System.out.println("completedTasks :: "+completedTasks);
//		System.out.println(taskList.size()-completedTasks);
		TaskStatus taskStatus = new TaskStatus();
		taskStatus.setCompletedTasks(completedTasks);
		taskStatus.setPendingTasks(taskList.size()-completedTasks);
		return taskStatus;
	}

	@Override
	public String updateTask(Integer taskId) {
		// TODO Auto-generated method stub
		String hql = "UPDATE Tasks set isMarkComplete = true "  + 
	             "WHERE taskId ="+taskId;
		return String.valueOf(entityManager.createQuery(hql).executeUpdate());
	}

	@Override
	public String deleteTask(Integer taskId) {
		// TODO Auto-generated method stub
		String hql = "DELETE Tasks WHERE taskId ="+taskId;
		
		return String.valueOf(entityManager.createQuery(hql).executeUpdate());
	}

}
