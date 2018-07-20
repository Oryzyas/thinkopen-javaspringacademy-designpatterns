package com.thinkopen.patterns.creational.factory.motogp;

public class Ducati extends MotoGp {
    private String potenza, coppia, rpm;

    public Ducati(String potenza, String coppia, String rpm) {
        this.potenza = potenza;
        this.coppia = coppia;
        this.rpm = rpm;
    }

    @Override
    public String getPotenza() {
        return potenza;
    }

    @Override
    public String getCoppia() {
        return coppia;
    }

    @Override
    public String getRpm() {
        return rpm;
    }
}
