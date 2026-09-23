package com.tasktracker;

import com.tasktracker.service.TaskManager;
import com.tasktracker.util.JsonFileHandler;

public class Main {

    public static void main(String[] args) {

        TaskManager manager = new TaskManager();
        JsonFileHandler fileHandler = new JsonFileHandler();

        if (args.length == 0) {
            System.out.println("Please provide a command.");
            return;
        }

        String command = args[0];

        if (command.equals("add")) {

            if (args.length < 2) {
                System.out.println("Please provide a task description.");
                return;
            }

            String description = args[1];

            manager.addTask(description);

            System.out.println("Task added successfully.");

        } else if (command.equals("list")) {

            manager.listTasks();

        } else {
            System.out.println("Unknown command.");
        }
    }
}