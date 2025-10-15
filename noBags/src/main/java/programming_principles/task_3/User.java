package programming_principles.task_3;

public class User {
    private String name;
    private String email;
    private String phoneNumber;


    //Конструктор при создании объекта будет использовать лишь три поля - остальные убираем
    public User(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
