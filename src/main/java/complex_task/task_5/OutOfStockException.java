package complex_task.task_5;

public class OutOfStockException extends RuntimeException {
    public OutOfStockException (String message){
        super(message);
    }
}
