package programming_principles.task_8;

public class Main {
    public static void main(String[] args) {

        //Создаем экземпляр нужного варианта уведомления
        SendMessage email = new Email();

        //Создаем сервис отправки
        NotificationService emailService = new NotificationService(email);

        emailService.sendLetter("_содержимое письма_");

    }
}
