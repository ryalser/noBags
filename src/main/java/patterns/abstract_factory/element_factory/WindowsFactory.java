package patterns.abstract_factory.element_factory;

public class WindowsFactory implements GUIFactory {

    public Button createButton(){
        return new WindowsButton();
    }

    public Window createWindow(){
        return new WindowsWindow();
    }

    public Menu createMenu(){
        return new WindowsMenu();
    }
}
