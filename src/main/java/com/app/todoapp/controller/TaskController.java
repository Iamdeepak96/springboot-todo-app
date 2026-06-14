package com.app.todoapp.controller;

import com.app.todoapp.models.Task;
import com.app.todoapp.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TaskController {

    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute("tasks",
                service.getAllTasks());

        return "index";
    }

    @PostMapping("/add")
    public String addTask(@RequestParam String title) {

        Task task = new Task();

        task.setTitle(title);
        task.setCompleted(false);

        service.saveTask(task);

        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteTask(@PathVariable Long id) {

        service.deleteTask(id);

        return "redirect:/";
    }

    @GetMapping("/toggle/{id}")
    public String toggleTask(@PathVariable Long id) {

        Task task = service.getTaskById(id);

        task.setCompleted(!task.isCompleted());

        service.saveTask(task);

        return "redirect:/";
    }
}