package programming_principles.task_8;

public class Email implements SendMessage {

    @Override
    public void send(String message) {
        System.out.println("Письмо на электронную почту: " + message);
    }
}
