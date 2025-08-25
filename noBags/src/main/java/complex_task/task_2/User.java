package complex_task.task_2;

public class User {

    private String name;
    private int age;
    private String emailUser;

    public User(String name, int age, String emailUser) {
        this.name = name;
        this.age = age;
        this.emailUser = emailUser;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }
}
