package patterns.abstract_factory.furniture_factory;

public class ClassicChair implements Chair {

    @Override
    public void sitOn() {
        System.out.println("Сидим на классическом стуле");
    }

    @Override
    public String getStyle() {
        return "Классический стул";
    }
}
