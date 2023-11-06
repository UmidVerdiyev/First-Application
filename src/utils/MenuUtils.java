package utils;

import bean.Config;

import java.util.Scanner;

import static utils.Menu.find;

public class MenuUtils {
    public static void showMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select a menu:");
        Menu.showAllMenu();

        int selectedMenu = sc.nextInt();

        if (selectedMenu >= 1 && selectedMenu <= Menu.values().length) {
            Menu selectedMenuEnum = find(selectedMenu);
            if(!Config.isLoggedIn()){
                if(selectedMenuEnum ==Menu.LOGIN || selectedMenuEnum == Menu.REGISTER_RACERS){
                    selectedMenuEnum.process();
                }
            }else{
                selectedMenuEnum.process();
            }
        } else {
            System.out.println("Please choose an available menu option.");
        }
    }

    public static void menuProcess(Menu menu) {
        menu.process();
    }
}
