package patterns.facade;

public class DoorFacade {

    private DoorOpen doorOpen;
    private DoorClose doorClose;
    private DoorLock doorLock;


    // Конструктор, который создаст нам три функции из разных классов
    public DoorFacade() {
        this.doorOpen = new DoorOpen();
        this.doorClose = new DoorClose();
        this.doorLock = new DoorLock();
    }

    // Использую перегрузку методов, чтобы выполнять разные действия одним методом
    public void actionWithDoors(String action) {
        if (action.equals("doorOpen")) {
            doorOpen.doorOpen();
        } else if (action.equals("doorClose")) {
            doorClose.doorClose();
        } else if (doorLock.equals("doorLock")) {
            doorLock.doorLock();
        } else {
            System.out.println("Укажите точное действие с дверью!");
        }
    }
}