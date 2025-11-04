package patterns.abstract_factory.furniture_factory;

public class ModernTable implements Table {

    @Override
    public void use(){
        System.out.println("Используем современный стол");
    }

    public String getStyle(){
        return "Современный стол";
    }

}
