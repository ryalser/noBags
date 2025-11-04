package patterns.abstract_factory.element_factory;

public class Main {
    public static void main(String[] args) {

        // Создаем фабрику элементов для Windows
        GUIFactory windowsFactory = new WindowsFactory();

        windowsFactory.createWindow().draw();
        windowsFactory.createButton().click();
        windowsFactory.createMenu().open();

        // Создаем фабрику элементов для Mac
        GUIFactory macFactory = new MacFactory();

        macFactory.createMenu().open();
        macFactory.createWindow().draw();
        macFactory.createButton().click();
    }
}
