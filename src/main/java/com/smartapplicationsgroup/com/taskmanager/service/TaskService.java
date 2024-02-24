package com.smartapplicationsgroup.com.taskmanager.service;

import com.smartapplicationsgroup.com.taskmanager.entity.Task;
import com.smartapplicationsgroup.com.taskmanager.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task getTaskById(Long id) {
        return taskRepository.findById(id).orElse(null);
    }

    public Task addTask(Task task) {
        return taskRepository.save(task);
    }

    public Task updateTask(String id, String status) {
        Task task = taskRepository.findById(Long.parseLong(id)).orElse(null);
        if (task != null) {
            task.setStatus(status);
            return taskRepository.save(task);
        }
        return null;
    }

    public List<Task> getTaskByStatus(String status) {
        return taskRepository.findByStatus(status);
    }

    public void deleteAllTasks() {
        taskRepository.deleteAll();
    }

    public void deleteTaskById(Long id) {
        taskRepository.deleteById(id);
    }
}
