package com.thinkopen.patterns.creational.singleton;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    public ChocolateBoiler() {
        empty = true;
        boiled = false;
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
