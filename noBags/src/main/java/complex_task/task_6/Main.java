package complex_task.task_6;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        TaskService taskService = new TaskService();

        // Создаем задачи и передаем в аргументы:
        taskService.addTask(new Task<>(1, LocalDateTime.now(), Task.Status.DONE, Task.Priority.HIGH));
        taskService.addTask(new Task<>(2, LocalDateTime.now(), Task.Status.NEW, Task.Priority.MIN));
        taskService.addTask(new Task<>(3, LocalDateTime.now(), Task.Status.DONE, Task.Priority.MIN));
        taskService.addTask(new Task<>(4, LocalDateTime.now(), Task.Status.NEW, Task.Priority.HIGH));


        // Пример сортированного списка задач:
        System.out.println("Получить список задач высокого приоритета: " +
                taskService.getTaskByPriority(Task.Priority.HIGH));
    }
}
