package complex_task.task_6;

import java.time.LocalDateTime;

public class Task <T> {

    private int id;
    private LocalDateTime dateTime;

    public enum Status  {NEW, IN_PROCESS, DONE}
    public enum Priority  {MIN, HIGH}

    private Status status;
    private Priority priority;

    public Task(int id, LocalDateTime dateTime, Status status, Priority priority) {
        this.id = id;
        this.dateTime = dateTime;
        this.status = status;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public Status getStatus() {
        return this.status;
    }

    public Priority getPriority() {
        return priority;
    }


    @Override
    public String toString(){
        return "Задача с приоритетом: " + getPriority() + ", ID: " + getId();
    }
}
