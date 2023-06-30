package Factory;

import Factory.components.buttons.Button;
import Factory.components.dropdowns.DropDown;
import Factory.components.menus.Menu;

public class Main {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatforms.ANDROID);
        UIFactory uiFactory = flutter.createUIFactory();

        Button button = uiFactory.createButton();
        button.changeSize();

        Menu menu = uiFactory.createMenu();
        menu.addMenu();

        DropDown dropdown = uiFactory.createDropdown();
        dropdown.addDropDown();
    }
}
