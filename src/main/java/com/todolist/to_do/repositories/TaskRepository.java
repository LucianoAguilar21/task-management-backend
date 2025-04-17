package com.todolist.to_do.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todolist.to_do.entities.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{

}
