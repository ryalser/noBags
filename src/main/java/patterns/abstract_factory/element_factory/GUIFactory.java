package patterns.abstract_factory.element_factory;

public interface GUIFactory {
    Button createButton();
    Window createWindow();
    Menu createMenu();
}
