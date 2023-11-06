package main;

public class MyException implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        if(e instanceof IllegalArgumentException){
            System.out.println("Illegal Argument are working");
        }
    }
}
