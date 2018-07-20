package com.thinkopen.patterns.creational.singleton;

public class ChocolateBoilerSingleton {
    private static ChocolateBoilerSingleton uniqueInstance;

    private boolean empty;
    private boolean boiled;

    private ChocolateBoilerSingleton() {
        empty = true;
        boiled = false;
    }

    public static synchronized ChocolateBoilerSingleton getInstance() {
        if(uniqueInstance == null)
            uniqueInstance = new ChocolateBoilerSingleton();

        return uniqueInstance;
    }

    public void fill() {
        if(empty && !boiled)
            empty = false;
    }

    public void drain() {
        if(!empty && boiled)
            empty = true;
    }

    public void boil() {
        if(!empty && !boiled)
            boiled = true;
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
