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
        loadTasks();
    }

   public void addTask(String description) {

    Task task = new Task(nextId, description);

    tasks.add(task);

    saveTasks();

    nextId++;

    System.out.println("Task added successfully.");
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
    public void deleteTask(int id) {

    for (Task task : tasks) {

        if (task.getId() == id) {
            tasks.remove(task);
            saveTasks();
            System.out.println("Task deleted successfully.");
            return;
        }
    }

    System.out.println("Task not found.");
}
public void updateTask(int id, String description) {

    for (Task task : tasks) {

        if (task.getId() == id) {

            task.setDescription(description);

            saveTasks();

            System.out.println("Task updated successfully.");
            return;
        }
    }

    System.out.println("Task not found.");
}

    private void loadTasks() {

    String data = fileHandler.readTasks();

    if (data.equals("") || data.equals("[]")) {
        return;
    }

    data = data.substring(1, data.length() - 1);

    String[] taskData = data.split("\\},\\{");

    for (String task : taskData) {

        task = task.replace("{", "").replace("}", "");

        String[] fields = task.split(",");

        int id = 0;
        String description = "";
        String status = "";

        for (String field : fields) {

            String[] keyValue = field.split(":", 2);

            String key = keyValue[0].replace("\"", "");
            String value = keyValue[1].replace("\"", "");

            if (key.equals("id")) {
                id = Integer.parseInt(value);
            } else if (key.equals("description")) {
                description = value;
            } else if (key.equals("status")) {
                status = value;
            }
        }

        tasks.add(new Task(id, description, status));

        if (id >= nextId) {
            nextId = id + 1;
        }
    }
}
private void saveTasks() {

    StringBuilder jsonData = new StringBuilder();

    jsonData.append("[");

    for (int i = 0; i < tasks.size(); i++) {

        Task task = tasks.get(i);

        jsonData.append("{\"id\":")
                .append(task.getId())
                .append(",\"description\":\"")
                .append(task.getDescription())
                .append("\",\"status\":\"")
                .append(task.getStatus())
                .append("\"}");

        if (i < tasks.size() - 1) {
            jsonData.append(",");
        }
    }

    jsonData.append("]");

    fileHandler.writeTasks(jsonData.toString());
}
}