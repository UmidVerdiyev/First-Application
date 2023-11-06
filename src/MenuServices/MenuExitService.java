package MenuServices;

import MenuServicesInter.MenuExitServiceInter;
import utils.Menu;

public class MenuExitService implements MenuExitServiceInter {
    @Override
    public void process() {
        System.exit(Menu.EXIT.getNumbers());

    }
}
