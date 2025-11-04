package complex_task.task_1;



public class Main {
    public static void main(String[] args) {


        EntityManager entityManager = new EntityManager();


        // Создаем пользователя в момент передачи параметра метода
        entityManager.addEntity(new User("Ivan",25,true));
        entityManager.addEntity(new User("Fedor",30,false));
        entityManager.addEntity(new User("Petya",17,true));



        // Вывод в консоль
        System.out.println("Вывести пользователей: " + entityManager.getEntities());
        System.out.println("Вывести пользователей старше 20 лет: " + entityManager.filterByAge(20));
    }
}
