package patterns.abstract_factory.furniture_factory;

public class ModernChair implements Chair {

    @Override
    public void sitOn() {
        System.out.println("Сидим на современном стуле");
    }

    @Override
    public String getStyle() {
        return "Современный стул";
    }
}
