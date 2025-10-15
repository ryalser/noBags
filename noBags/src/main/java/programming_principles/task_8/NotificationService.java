package programming_principles.task_8;

public class NotificationService {
    private SendMessage sendMessage;

    public NotificationService(SendMessage sendMessage) {
        this.sendMessage = sendMessage;
    }

    public void sendLetter(String message) {
        sendMessage.send(message);
    }
}
