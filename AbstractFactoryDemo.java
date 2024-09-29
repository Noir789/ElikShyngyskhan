interface Button {
    void click();
}

interface Window {
    void open();
}

class WindowsButton implements Button {
    @Override
    public void click() {
        System.out.println("Windows button clicked.");
    }
}

class WindowsWindow implements Window {
    @Override
    public void open() {
        System.out.println("Windows window opened.");
    }
}

class MacButton implements Button {
    @Override
    public void click() {
        System.out.println("Mac button clicked.");
    }
}

class MacWindow implements Window {
    @Override
    public void open() {
        System.out.println("Mac window opened.");
    }
}

interface GUIFactory {
    Button createButton();
    Window createWindow();
}

class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Window createWindow() {
        return new WindowsWindow();
    }
}

class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Window createWindow() {
        return new MacWindow();
    }
}

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        GUIFactory factory = new WindowsFactory();

        Button button = factory.createButton();
        Window window = factory.createWindow();

        button.click();
        window.open();
    }
}
