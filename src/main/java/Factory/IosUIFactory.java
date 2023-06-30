package Factory;

import Factory.components.buttons.Button;
import Factory.components.buttons.IosButton;
import Factory.components.dropdowns.DropDown;
import Factory.components.dropdowns.IosDropDown;
import Factory.components.menus.IosMenu;
import Factory.components.menus.Menu;

public class IosUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Menu createMenu() {
        return new IosMenu();
    }

    @Override
    public DropDown createDropdown() {
        return new IosDropDown();
    }
}
