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

    public Task(int id, String description, String status) {
        this.id = id;
        this.description = description;
        this.status = status;
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

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}