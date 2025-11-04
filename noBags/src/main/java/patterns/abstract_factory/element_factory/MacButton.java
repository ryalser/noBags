package patterns.abstract_factory.element_factory;

public class MacButton implements Button {

    @Override
    public void click(){
        System.out.println("Нажать кнопку в Mac");
    }
}
