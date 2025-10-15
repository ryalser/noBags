package complex_task;

import complex_task.task_6.Task;
import complex_task.task_6.TaskService;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TaskServiceTest {

    // Подготовка данных
    TaskService<String> taskService = new TaskService<>();

    Task<String> task1 = new Task<>(1, LocalDateTime.now(), Task.Status.NEW, Task.Priority.HIGH);
    Task<String> task2 = new Task<>(2, LocalDateTime.now(), Task.Status.DONE, Task.Priority.MIN);


    @Test
    void testAddTask() {
        assertDoesNotThrow(() -> taskService.addTask(task1));
    }

    @Test
    void testDeleteTask() {
        taskService.addTask(task1);
        assertFalse(taskService.deleteTask("999"));
    }

    @Test
    void testGetTaskByStatus() {

        taskService.addTask(task1);
        taskService.addTask(task2);

        List<Task<String>> result = taskService.getTaskByStatus(Task.Status.NEW);
        assertEquals(1, result.size());
    }
}