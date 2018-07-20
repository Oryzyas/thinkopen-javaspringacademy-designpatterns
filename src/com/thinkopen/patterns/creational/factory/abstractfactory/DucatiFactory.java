package com.thinkopen.patterns.creational.factory.abstractfactory;

import com.thinkopen.patterns.creational.factory.motogp.Ducati;
import com.thinkopen.patterns.creational.factory.motogp.MotoGp;

public class DucatiFactory implements MotoGpAbstractFactory {
    private String potenza, coppia, rpm;

    public DucatiFactory(String potenza, String coppia, String rpm) {
        this.potenza = potenza;
        this.coppia = coppia;
        this.rpm = rpm;
    }

    @Override
    public MotoGp createMotoGp() {
        return new Ducati(potenza, coppia, rpm);
    }
}
