package MenuServices;

import MenuServicesInter.MenuLogOutServiceInter;
import utils.Menu;

import java.util.Scanner;

public class MenuLogOutService implements MenuLogOutServiceInter {
    @Override
    public void process() {
        Scanner sc = new Scanner(System.in);
        if(Menu.LOGOUT == numbers(4)){
            sc.close();
        }

    }

    private Menu numbers(int i) {
        return null;
    }

}
