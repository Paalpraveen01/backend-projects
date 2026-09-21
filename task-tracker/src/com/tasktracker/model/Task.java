package com.tasktracker.model;

public class Task {

    private int id;
    private String description;
    private String status;

    public Task(int id, String description) {
        this.id = id;
        this.description = description;
        this.status = "todo";
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }
}