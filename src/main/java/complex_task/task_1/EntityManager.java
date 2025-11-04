package complex_task.task_1;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class EntityManager <T> {

    // Потокобезопасная коллекция
    List<T> entities = new CopyOnWriteArrayList<>();


    // Добавление сущности
    public synchronized void addEntity(T entity) {
        entities.add(entity);
    }

    // Удаление сущности
    public boolean deleteEntity(T entity) {
        return entities.remove(entity);
    }

    // Получение всех элементов
    public List<T> getEntities() {
        return new CopyOnWriteArrayList<>(entities);
    }

    // Фильтрация по возрасту
    public List<T> filterByAge(int minAge) {
        return entities.stream()
                .filter(e -> e instanceof User)
                .map(e -> (User) e)
                .filter(e -> e.getAge() > minAge)
                .map(user -> (T) user)
                .collect(Collectors.toList());
    }

    // Фильтрация по имени:
    public List<T> filterByName(String name) {
        return entities.stream()
                .filter(e -> e instanceof User)
                .map(e -> (User) e)
                .filter(e -> e.getName().equals(name))
                .map(user -> (T) user)
                .collect(Collectors.toList());
    }

    // Фильтрация по активности
    public List<T> filterByActive(boolean active) {
        return entities.stream()
                .filter(e -> e instanceof User)
                .map(e -> (User) e)
                .filter(e -> e.isActive() == active)
                .map(user -> (T) user)
                .collect(Collectors.toList());

    }
}
