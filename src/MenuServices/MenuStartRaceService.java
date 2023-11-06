package MenuServices;

import MenuServicesInter.MenuStartRaceInter;

import java.util.Random;
import java.util.Scanner;

public class MenuStartRaceService implements MenuStartRaceInter {
    @Override
    public void process() {
        Scanner sc  = new Scanner(System.in);
        Random random = new Random();


        System.out.println("Guess number between 1 and 5");
        int userGuess = sc.nextInt();
        int randomNumber  = random.nextInt(5) + 1;
        if(userGuess == randomNumber){
            System.out.println("You successfully found");
        }else{
            System.out.println("Game over");
        }
    }
}
