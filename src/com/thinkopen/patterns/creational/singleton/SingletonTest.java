package com.thinkopen.patterns.creational.singleton;

public class SingletonTest {

    public static void main(String[] args) {
        ChocolateBoiler cb1 = new ChocolateBoiler();
        ChocolateBoiler cb2 = new ChocolateBoiler();

        System.out.println("Senza Singleton:\n");
        System.out.println(cb1);
        System.out.println(cb2);

        System.out.println("\nCon Singleton:\n");
        ChocolateBoilerSingleton cbs1 = ChocolateBoilerSingleton.getInstance();
        ChocolateBoilerSingleton cbs2 = ChocolateBoilerSingleton.getInstance();

        System.out.println(cbs1);
        System.out.println(cbs2);
    }

}
