package com.tasktracker.util;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;

public class JsonFileHandler {

    private static final String FILE_NAME = "tasks.json";

    public JsonFileHandler() {

        File file = new File(FILE_NAME);

        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("tasks.json created.");
            } catch (Exception e) {
                System.out.println("Error occurs creating tasks.json.");
            }
        }
    }

    public void writeTasks(String jsonData) {

        try {
            FileWriter writer = new FileWriter(FILE_NAME);

            writer.write(jsonData);

            writer.close();

            System.out.println("Tasks saved successfully.");

        } catch (Exception e) {
            System.out.println("Error writing tasks.json.");
        }
    }
    public String readTasks() {

    try {
        FileReader reader = new FileReader(FILE_NAME);

        StringBuilder data = new StringBuilder();

        int character;

        while ((character = reader.read()) != -1) {
            data.append((char) character);
        }

        reader.close();

        return data.toString();

    } catch (Exception e) {
        System.out.println("Error reading tasks.json.");
        return "";
    }
}
}