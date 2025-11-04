package complex_task;

import complex_task.task_1.EntityManager;
import complex_task.task_1.User;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EntityManagerTest {

    // Подготовка данных
     EntityManager<User> entityManager = new EntityManager<>();

     User user1 = new User("Ivan", 25, true);
     User user2 = new User("Fedor", 30, false);



    @Test
    void testAddAndGetEntities() {
        entityManager.addEntity(user1);
        entityManager.addEntity(user2);

        List<User> result = entityManager.getEntities();
           assertEquals(2, result.size());

           assertTrue(result.contains(user1));
           assertTrue(result.contains(user2));
    }

    @Test
    void testDeleteEntity() {
        entityManager.addEntity(user1);

           assertTrue(entityManager.deleteEntity(user1));
           assertTrue(entityManager.getEntities().isEmpty());
    }

    @Test
    void testFilterByAge() {

        entityManager.addEntity(user1); // 25 лет юзеру
        entityManager.addEntity(user2); // 30  лет юзеру

        List<User> result = entityManager.filterByAge(26);

           assertEquals(1, result.size());
           assertEquals(user2, result.get(0));
    }
}

