package patterns.facade;

public class Main {
    public static void main(String[] args) {

        // Создаем экземпляр класса, умеющего работать со всеми функциями управления дверью
        DoorFacade doorFacade = new DoorFacade();


        // doorOpen - открыть дверь
        // doorClose - закрыть дверь
        // doorLock - блок/разблокировать
        // Иначе: предупреждение
        doorFacade.actionWithDoors("doorClose");
    }
}
