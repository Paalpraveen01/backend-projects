package com.tasktracker.service;

import com.tasktracker.model.Task;
import com.tasktracker.util.JsonFileHandler;
import java.util.ArrayList;

public class TaskManager {

    private ArrayList<Task> tasks;
    private int nextId;
    private JsonFileHandler fileHandler;

    public TaskManager() {
        tasks = new ArrayList<>();
        nextId = 1;
        fileHandler = new JsonFileHandler();
    }

    public void addTask(String description) {

    String existingData = fileHandler.readTasks();

    Task task = new Task(nextId, description);

    tasks.add(task);

    String jsonData;

    if (existingData.equals("") || existingData.equals("[]")) {

        jsonData =
                "[{\"id\":" + task.getId() +
                ",\"description\":\"" + task.getDescription() +
                "\",\"status\":\"" + task.getStatus() +
                "\"}]";

    } else {

        jsonData = existingData.substring(0, existingData.length() - 1)
                + ",{\"id\":" + task.getId()
                + ",\"description\":\"" + task.getDescription()
                + "\",\"status\":\"" + task.getStatus()
                + "\"}]";
    }

    fileHandler.writeTasks(jsonData);

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