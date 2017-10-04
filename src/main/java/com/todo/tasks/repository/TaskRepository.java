package com.todo.tasks.repository;

import org.springframework.data.repository.CrudRepository;

import com.todo.tasks.model.Tasks;

public interface TaskRepository extends CrudRepository<Tasks, Long>{
	
}
