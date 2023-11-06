package MenuServices;

import MenuServicesInter.MenuRegisterRacersInter;

import java.util.Scanner;

public class MenuRegisterRacersService implements MenuRegisterRacersInter {
    @Override
    public void process() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please mention how many person U will be Register");
        int valueOfRacer = sc.nextInt();
        sc.nextLine();

        for(int i =1;i<= valueOfRacer;i++){
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Please mention name and surname");
            String nameAndSurname = sc2.nextLine();
        }
        System.out.println("Every racer registered");
    }
}
