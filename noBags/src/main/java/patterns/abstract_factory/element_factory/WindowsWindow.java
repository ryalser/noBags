package patterns.abstract_factory.element_factory;

public class WindowsWindow implements Window {

    @Override
    public void draw(){
        System.out.println("Открыть окно в Windows");
    }
}
