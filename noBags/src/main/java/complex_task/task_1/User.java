package complex_task.task_1;

public class User {

    private String name;
    private int age;
    private boolean active;

    public User(String name, int age, boolean active) {
        this.name = name;
        this.age = age;
        this.active = active;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isActive() {
        return active;
    }


    @Override
    public String toString(){
        return "Имя: " + getName() + ", возраст: " + getAge() +
        ", активность " + isActive();
    }
}
