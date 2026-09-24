# 🚀 Task Tracker CLI

> 📝 A simple and efficient command-line Task Tracker application built using Java.

![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=openjdk)
![GitHub](https://img.shields.io/badge/GitHub-Repository-black?style=for-the-badge&logo=github)
![Status](https://img.shields.io/badge/Status-Completed-success?style=for-the-badge)

---

## 📌 About the Project

Task Tracker CLI is a command-line application developed using **Java**.

It allows users to:

- ➕ Add tasks
- 📋 List tasks
- ✏️ Update tasks
- 🗑️ Delete tasks
- 💾 Store tasks permanently in a JSON file
- 🔄 Load saved tasks when the application starts

---

## ✨ Features

| Feature | Description |
|---|---|
| ➕ Add Task | Create a new task |
| 📋 List Tasks | Display all available tasks |
| ✏️ Update Task | Modify an existing task |
| 🗑️ Delete Task | Remove a task |
| 💾 JSON Storage | Store tasks locally |
| 🔢 Auto ID | Generate task IDs automatically |
| 🔄 Persistence | Load tasks after restarting |

---

## 🛠️ Technologies Used

- ☕ Java
- 🧱 Object-Oriented Programming
- 📦 ArrayList
- 📁 Java File I/O
- 📄 JSON
- 🔧 Git
- 🐙 GitHub

---

## 📂 Project Structure

```text
task-tracker/
│
├── 📄 README.md
├── 📄 .gitignore
├── 📄 tasks.json
│
└── 📁 src/
    └── 📁 com/
        └── 📁 tasktracker/
            │
            ├── 📄 Main.java
            │
            ├── 📁 model/
            │   └── 📄 Task.java
            │
            ├── 📁 service/
            │   └── 📄 TaskManager.java
            │
            └── 📁 util/
                └── 📄 JsonFileHandler.java
```

---

# 🚀 How to Run

## 📥 1. Clone the Repository

```bash
git clone https://github.com/Paalpraveen01/backend-projects.git
```

🎯 Clone the repository to your local system.

---

## 📂 2. Navigate to Task Tracker

```powershell
cd backend-projects/task-tracker
```

📁 Move into the Task Tracker project directory.

---

## ⚙️ 3. Compile the Project

```powershell
javac -d out (Get-ChildItem -Recurse -Filter *.java).FullName
```

🛠️ This compiles all Java source files and stores the compiled files inside the `out` directory.

---

## ▶️ 4. Run the Application

```powershell
java -cp out com.tasktracker.Main
```

🚀 The Task Tracker CLI will start.

---

# 💻 Commands

## ➕ Add a Task

```powershell
java -cp out com.tasktracker.Main add "Learn Java"
```

### ✅ Output

```text
Tasks saved successfully.
Task added successfully.
```

---

## 📋 List Tasks

```powershell
java -cp out com.tasktracker.Main list
```

### 📊 Output

```text
1 | todo | Learn Java
2 | todo | Learn SQL
3 | todo | Learn Spring
```

---

## ✏️ Update a Task

```powershell
java -cp out com.tasktracker.Main update 1 "Learn Advanced Java"
```

### ✅ Output

```text
Tasks saved successfully.
Task updated successfully.
```

---

## 🗑️ Delete a Task

```powershell
java -cp out com.tasktracker.Main delete 2
```

### ✅ Output

```text
Tasks saved successfully.
Task deleted successfully.
```

---

# 💾 Data Persistence

All task information is stored in:

```text
tasks.json
```

Example:

```json
[
  {
    "id": 1,
    "description": "Learn Java",
    "status": "todo"
  },
  {
    "id": 2,
    "description": "Learn SQL",
    "status": "todo"
  }
]
```

🔄 When the application starts again, the saved tasks are automatically loaded.

---

# 🧩 Task Model

Each task contains:

| Property | Description |
|---|---|
| 🆔 `id` | Unique task ID |
| 📝 `description` | Task description |
| 📌 `status` | Current task status |

Example:

```text
1 | todo | Learn Java
```

---

# 🏗️ Architecture

```text
             🚀 Main.java
                  │
                  ▼
          🎯 TaskManager.java
                  │
          ┌───────┴────────┐
          ▼                ▼
     📦 Task.java    💾 JsonFileHandler.java
                           │
                           ▼
                     📄 tasks.json
```

---

# 🧠 Learning Objectives

This project helped strengthen my understanding of:

- ☕ Java fundamentals
- 🧱 Classes and Objects
- 🔐 Encapsulation
- 🏗️ Constructors
- 🔄 Getters and Setters
- 📦 ArrayList
- 🔁 Loops
- 🔀 Conditional Statements
- 💻 Command-Line Arguments
- 📁 File Handling
- 📄 JSON Processing
- 🔧 CRUD Operations
- 💾 Data Persistence
- 🌳 Git & GitHub

---

# 🛡️ Error Handling

The application handles basic errors such as:

- ⚠️ Missing commands
- ⚠️ Missing task descriptions
- ⚠️ Missing task IDs
- ⚠️ Task not found
- ⚠️ File reading errors
- ⚠️ File writing errors

Example:

```text
Task not found.
```

---

# 🔮 Future Improvements

The project can be extended with:

- 🔄 `mark-in-progress` command
- ✅ `mark-done` command
- 🔎 Filter tasks by status
- 🕐 `createdAt` timestamp
- 🕐 `updatedAt` timestamp
- 🧪 Unit testing
- 📦 Maven project structure
- 🛡️ Improved input validation
- 📄 Improved JSON parsing

---

# 🎬 Project Workflow

```text
📥 Clone Repository
        ↓
📂 Open Project
        ↓
⚙️ Compile Java Files
        ↓
🚀 Run Application
        ↓
➕ Add Task
        ↓
📋 List Tasks
        ↓
✏️ Update Task
        ↓
🗑️ Delete Task
        ↓
💾 Save to JSON
        ↓
🔄 Load Data on Restart
```

---

# 🎯 Project Status

![Status](https://img.shields.io/badge/Project-Completed-brightgreen?style=for-the-badge)

✅ Core CRUD operations implemented  
✅ JSON persistence implemented  
✅ Command-line interface implemented  
✅ GitHub-ready project structure  

---

# 👨‍💻 Author

### Paal Praveen M

🎓 B.E. Electronics and Communication Engineering  
💻 Aspiring Software Engineer

🔗 GitHub:  
https://github.com/Paalpraveen01

---

## ⭐ Support

If you found this project useful, consider giving the repository a ⭐ on GitHub!

---

> 🚀 **Build. Learn. Code. Repeat.**