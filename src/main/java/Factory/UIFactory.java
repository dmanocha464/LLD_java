package Factory;
import Factory.components.buttons.Button;
import Factory.components.dropdowns.DropDown;
import Factory.components.menus.Menu;
public interface UIFactory {
    public Button createButton();
    public Menu createMenu();
    public DropDown createDropdown();
}
