package patterns.singletone;

public class ConfigurationManager {

    private static ConfigurationManager instance;

    // БД
    private String dataBaseURL;
    private String dataBaseNameUSer;
    private String dataBasePassword;

    // Путь к папке для хранения файлов
    private String path;

    // Настройки логирования
    private String levelLogger;
    private String pathLogger;


    // Приватный конструктор
    private ConfigurationManager() {
        initialDefaultConfiguration();
    }

    // Метод установки дефолтной конфигурации
    public void initialDefaultConfiguration() {
        this.dataBaseURL = "defaultLocalhost";
        this.dataBaseNameUSer = "defaultUser";
        this.dataBasePassword = "defaultPassword";
        this.path = "defaultPath";
        this.levelLogger = "defaultLevelLogger";
        this.pathLogger = "defaultPathLogger";
    }

    // Метод для публичного доступа
    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    // Геттеры
    public String getDataBaseURL() {
        return dataBaseURL;
    }

    public String getDataBaseNameUSer() {
        return dataBaseNameUSer;
    }

    public String getDataBasePassword() {
        return dataBasePassword;
    }

    public String getPath() {
        return path;
    }

    public String getLevelLogger() {
        return levelLogger;
    }

    public String getPathLogger() {
        return pathLogger;
    }


    //Сеттеры
    public static void setInstance(ConfigurationManager instance) {
        ConfigurationManager.instance = instance;
    }

    public void setDataBaseURL(String dataBaseURL) {
        this.dataBaseURL = dataBaseURL;
    }

    public void setDataBaseNameUSer(String dataBaseNameUSer) {
        this.dataBaseNameUSer = dataBaseNameUSer;
    }

    public void setDataBasePassword(String dataBasePassword) {
        this.dataBasePassword = dataBasePassword;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setLevelLogger(String levelLogger) {
        this.levelLogger = levelLogger;
    }

    public void setPathLogger(String pathLogger) {
        this.pathLogger = pathLogger;
    }
}
