package Factory;

import Factory.components.buttons.AndroidButton;
import Factory.components.buttons.Button;
import Factory.components.dropdowns.AndroidDropDown;
import Factory.components.dropdowns.DropDown;
import Factory.components.menus.AndroidMenu;
import Factory.components.menus.Menu;

public class AndroidUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public DropDown createDropdown() {
        return new AndroidDropDown();
    }
}
