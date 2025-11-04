package patterns.abstract_factory.element_factory;

public class WindowsMenu implements Menu {

    @Override
    public void open(){
        System.out.println("Открыть меню Windows");
    }
}
