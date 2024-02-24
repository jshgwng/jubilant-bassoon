package com.smartapplicationsgroup.com.taskmanager.controller;

import com.smartapplicationsgroup.com.taskmanager.entity.Task;
import com.smartapplicationsgroup.com.taskmanager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {
    @Autowired
    private TaskService taskService;

    @RequestMapping(path = "/tasks", method = RequestMethod.GET)
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }
}
