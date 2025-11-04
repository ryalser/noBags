package patterns.abstract_factory.furniture_factory;

public class ModernFurnitureFactory implements FurnitureFactory {

    public Chair createChair(){
        return new ModernChair();
    }

    public Table createTable(){
        return new ModernTable();
    }

}
