package patterns.abstract_factory.furniture_factory;

public class ClassicFurnitureFactory implements FurnitureFactory {

    public Chair createChair(){
        return new ClassicChair();
    }

    public Table createTable(){
        return new ClassicTable();
    }
}
