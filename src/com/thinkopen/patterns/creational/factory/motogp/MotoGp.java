package com.thinkopen.patterns.creational.factory.motogp;

public abstract class MotoGp {

    public abstract String getPotenza();
    public abstract String getCoppia();
    public abstract String getRpm();

    @Override
    public String toString() {
        return "MotoGp values: Potenza - " + this.getPotenza() + " Coppia - " + this.getCoppia() + " Rpm - " + getRpm();
    }

}
