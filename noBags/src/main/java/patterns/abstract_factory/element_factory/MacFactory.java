package patterns.abstract_factory.element_factory;

public class MacFactory implements GUIFactory {

    public Button createButton(){
        return new MacButton();
    }

    public Window createWindow(){
        return new MacWindow();
    }

    public Menu createMenu(){
        return new MacMenu();
    }
}
