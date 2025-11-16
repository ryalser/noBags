package practice_11;

/**
 * Код должен увеличить возраст человека, но почему-то возраст остаётся прежним.
 */

public class DebugTask5 {
    public static void main(String[] args) {
        Person person = new Person("Alice", 25);
        person.incrementAge();
        System.out.println("Updated age: " + person.getAge());
    }
}

class Person {
    private String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name; // Добавил this
    }

    public int getAge() {
        return this.age; // Добавил this
    }

    public void incrementAge() {
        this.age++;
    }
}


