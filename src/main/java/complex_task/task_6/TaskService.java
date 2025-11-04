package complex_task.task_6;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TaskService <T> {


    // Храним задачи в коллекции:
    List <Task<T>> tasks = new ArrayList<>();


    // Добавление задачи
    public synchronized void addTask(Task <T> task){
        tasks.add(task);
    }

    // Удаление задачи
    public synchronized boolean deleteTask(T id){
        return tasks.removeIf(t -> id.equals(t.getId()));
    }

    // Фильтрация задач по статусу
    public List<Task<T>> getTaskByStatus(Task.Status status){
        return tasks.stream()
                .filter(t -> t.getStatus() == status)
                .collect(Collectors.toList());
    }

    // Фильтрация по статусу
    public List<Task<T>> getTaskByPriority(Task.Priority priority){
        return tasks.stream()
                .filter(t -> t.getPriority() == priority)
                .collect(Collectors.toList());
    }

    // Фильтрация по дате
    public List<Task<T>> getTaskByDate(LocalDateTime localDateTime){
        return tasks.stream()
                .filter(t -> t.getDateTime() == localDateTime)
                .collect(Collectors.toList());
    }

}
