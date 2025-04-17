package com.todolist.to_do.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todolist.to_do.entities.Task;
import com.todolist.to_do.repositories.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService{

    @Autowired
    TaskRepository taskRepository;

    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Optional<Task> getTaskById(Long id) {
        return taskRepository.findById(id);
    }

    @Override
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public Task updateTask(Long id, Task task) {
        Task taskToUpdate = taskRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Task not found with id " + id));
       
        taskToUpdate.setTitle(task.getTitle());
        taskToUpdate.setDescription(task.getDescription());
        taskToUpdate.setCompleted(task.isCompleted());

        return taskRepository.save(taskToUpdate);
    }

    @Override
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

}
