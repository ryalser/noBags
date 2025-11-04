package patterns.abstract_factory.element_factory;

public class WindowsButton implements Button {

    @Override
    public void click(){
        System.out.println("Нажать кнопку в Windows");
    }
}
