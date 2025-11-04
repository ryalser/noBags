package patterns.singletone;

public class Main {
    public static void main(String[] args) {

        // ЗАДАЧА 1: ConfigurationManager
        // Создадим два объекта ConfigurationManager
        ConfigurationManager configurationManager_1 = ConfigurationManager.getInstance();
        ConfigurationManager configurationManager_2 = ConfigurationManager.getInstance();


        boolean isOneObject = configurationManager_1 == configurationManager_2;
        System.out.println("Это один и тот же объект? Ответ: " + isOneObject);

        // Проверим, что объекты действительно равны:
        configurationManager_1.setDataBaseNameUSer("new User");

        System.out.println(
                "Имя пользователя у первого экземпляра: " + configurationManager_1.getDataBaseNameUSer()
                        + "; Имя пользователя у второго экземпляра: " + configurationManager_2.getDataBaseNameUSer());


        // ЗАДАЧА 2: Logger
        // Создадим два объекта Logger
        Logger logger_1 = Logger.getInstance();
        Logger logger_2 = Logger.getInstance();

        // Два объекта Logger сравним между собой
        boolean isOneObjectLogger = logger_2 == logger_1;
        System.out.println("logger_1 и logger_2 - это один и тот же объект?, Ответ: " + isOneObjectLogger);

        // Два объекта Logger работают абсолютно идентично
        logger_1.error("Возникла ошибка ХХХХХХХХ");
        logger_2.error("Возникла ошибка ХХХХХХХХ");

    }
}
