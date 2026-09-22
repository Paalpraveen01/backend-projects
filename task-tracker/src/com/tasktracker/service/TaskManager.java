package com.tasktracker.service;

import com.tasktracker.model.Task;
import java.util.ArrayList;

public class TaskManager {

    private ArrayList<Task> tasks;
    private int nextId;

    public TaskManager() {
        tasks = new ArrayList<>();
        nextId = 1;
    }

    public void addTask(String description) {
        Task task = new Task(nextId, description);
        tasks.add(task);
        nextId++;
    }

    public void listTasks() {
        for (Task task : tasks) {
            System.out.println(
                task.getId() + " | " +
                task.getStatus() + " | " +
                task.getDescription()
            );
        }
    }
}