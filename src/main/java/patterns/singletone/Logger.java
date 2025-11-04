package patterns.singletone;

public class Logger {

    // Единственный экземпляр
    private static Logger instance;

    // Поля класса - сообщения
    private String info;
    private String error;
    private String warning;


    // Приватный конструктор
    private Logger() {
        initialDefaultConfig();
    }

    // Метод для доступа
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Метод установки дефолтных значений
    private void initialDefaultConfig() {
        this.info = "Информационный лог: ";
        this.error = "Лог, информирующий об ошибке: ";
        this.warning = "Лог с предупреждением: ";
    }


    //Геттеры
    public String getInfo() {
        return info;
    }

    public String getError() {
        return error;
    }

    public String getWarning() {
        return warning;
    }


    //Методы вывода логов
    public void info(String message) {
        System.out.println(getInfo() + message);
    }

    public void error(String message) {
        System.out.println(getError() + message);
    }

    public void warning(String message) {
        System.out.println(getWarning() + message);
    }
}
