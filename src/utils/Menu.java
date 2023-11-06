package utils;

import MenuServices.*;
import MenuServicesInter.MenuService;
import bean.Config;

public enum Menu {
    LOGIN(1,"Login",new MenuLoginService()),
    REGISTER_RACERS(2,"Register Racers",new MenuRegisterRacersService()),
    START_RACE(3,"Start Race",new MenuStartRaceService()),
    LOGOUT(4,"LogOut",new MenuLogOutService()),
    EXIT(5,"Exit",new MenuExitService()),
    UNKNOWN();
    Menu(){

    }



    private MenuService service;
    private int numbers;
    private String label;

    Menu(int numbers,String label,MenuService service) {
        this.numbers = numbers;
        this.label = label;
        this.service = service;
    }
    public int getNumbers() {
        return numbers;
    }

    public String getLabel() {
        return label;
    }
    public MenuService getService() {
        return service;
    }

    @Override
    public String toString() {
        return numbers + ". " + label;
    }
    public void process(){
        service.process();
        MenuUtils.showMenu();
    }
    public static Menu find(int numbers){
        Menu[] menus = Menu.values();
        for(int i = 0; i< menus.length;i++){
            if(menus[i].getNumbers() == numbers)
                return menus[i];

        }
        return Menu.UNKNOWN;
    }
    public static void showAllMenu(){
        Menu[] menus = Menu.values();
        for(int i =0;i< menus.length;i++){
            if(menus[i] !=UNKNOWN){
                if(menus[i]==LOGIN || menus[i] == REGISTER_RACERS){
                    System.out.println(menus[i]);
                } else if (Config.isLoggedIn()) {
                    System.out.println(menus[i]);

                }
            }
        }
    }
}
