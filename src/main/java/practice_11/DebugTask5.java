package practice_11;

/**
 * Код должен увеличить возраст человека, но почему-то возраст остаётся прежним.
 */

public class DebugTask5 {
    public static void main(String[] args) {
        Person person = new Person("Alice", 25);
        updateAge(person);
        System.out.println("Updated age: " + person.getAge());
    }
    public static void updateAge(Person person) {
        person = new Person(person.getName(), person.getAge() + 1);
        person.getAge(); // Добавил вызов геттера, чтобы получить текущее состояние поля класса Person
    }
}
class Person {
    private String name;
    public static int age;

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
}


