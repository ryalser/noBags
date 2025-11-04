package patterns.abstract_factory.element_factory;

public class MacWindow implements Window {

    @Override
    public void draw(){
        System.out.println("Открыть окно в Mac");
    }
}
