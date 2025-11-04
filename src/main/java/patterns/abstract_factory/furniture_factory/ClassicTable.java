package patterns.abstract_factory.furniture_factory;

public class ClassicTable implements Table {

    @Override
    public void use(){
        System.out.println("Используем классический стол");
    }

    public String getStyle(){
        return "Классический стол";
    }
}
