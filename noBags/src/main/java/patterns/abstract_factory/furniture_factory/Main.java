package patterns.abstract_factory.furniture_factory;

public class Main {
    public static void main(String[] args) {


        // СОВРЕМЕННАЯ МЕБЕЛЬ
        // Создаем фабрику современной мебели
        FurnitureFactory modernFactory = new ModernFurnitureFactory();

        // Создаем современную мебель
        Chair modernChair = modernFactory.createChair();
        Table modernTable = modernFactory.createTable();

        // Используем современную мебель
        System.out.println("Получаем стиль стула: " + modernChair.getStyle());
        System.out.println("Получаем стиль стола: " + modernTable.getStyle());
        modernChair.sitOn();
        modernTable.use();

        // КЛАССИЧЕСКАЯ МЕБЕЛЬ
        // Создаем фабрику классической мебели
        FurnitureFactory classicFactory = new ClassicFurnitureFactory();

        // Создаем классическую мебель
        Chair classicChair = classicFactory.createChair();

        // Используем классическую мебель
        System.out.println("Получаем стиль стула: " + classicChair.getStyle());
        classicChair.sitOn();
    }
}
