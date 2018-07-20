package com.thinkopen.patterns.creational.factory.abstractfactory;

import com.thinkopen.patterns.creational.factory.motogp.Honda;
import com.thinkopen.patterns.creational.factory.motogp.MotoGp;

public class HondaFactory implements MotoGpAbstractFactory {
    private String potenza, coppia, rpm;

    public HondaFactory(String potenza, String coppia, String rpm) {
        this.potenza = potenza;
        this.coppia = coppia;
        this.rpm = rpm;
    }

    @Override
    public MotoGp createMotoGp() {
        return new Honda(potenza, coppia, rpm);
    }
}
