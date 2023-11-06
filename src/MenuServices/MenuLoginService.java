package MenuServices;

import MenuServicesInter.MenuLoginServiceInter;
import bean.Config;

import java.util.Scanner;

public class MenuLoginService implements MenuLoginServiceInter {
    @Override
    public void process() {

        Scanner sc = new Scanner(System.in);
        int count = 0;
        boolean banned = false;
        while (!banned) {
            System.out.println("Username: ");
            String username = sc.nextLine();

            System.out.println("Password: ");
            String password = sc.nextLine();

            if (!(username.equals("user") && password.equals("1212"))) {
                System.out.println("Username and Password are Invalid");
                count++;
                if (count >= 3) {
                    System.out.println("You have exceeded the maximum login attempts. You are banned.");
                    banned = true;
                }
            } else {
                System.out.println("Login successful");
                banned = true;
            }
        }
        Config.setLoggedIn(true);


    }

}
