package practice_5.task_2;

public class Main {

    public static void main(String[] args) {

        // кто будет ухаживать, создаем объект класса PetManager
        PetManager petManager = new PetManager();

        Pet dog = new Dog();//создаем кошку
        petManager.toLookAfter(dog);//ухаживаем за собакой

        Pet cat = new Cat();//создаем собаку
        petManager.toLookAfter(cat);//ухаживаем за кошкой


    }
}
