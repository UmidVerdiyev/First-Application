package bean;

import java.io.Serializable;

public class Config implements Serializable {
    private static boolean loggedIn;
    private Racer[] racers;
    private static final Config instance = new Config();


    public Config() {
    }


    public static Config getConfig() {
        return instance;
    }

    public static boolean isLoggedIn() {
        return loggedIn;
    }

    public static void setLoggedIn(boolean b) {
         loggedIn = b;
    }

    public Racer[] getRacers() {
        return racers;
    }

    public void setRacers(Racer[] racers) {
        this.racers = racers;
    }
}
