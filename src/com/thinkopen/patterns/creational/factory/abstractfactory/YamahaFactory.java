package com.thinkopen.patterns.creational.factory.abstractfactory;

import com.thinkopen.patterns.creational.factory.motogp.MotoGp;
import com.thinkopen.patterns.creational.factory.motogp.Yamaha;

public class YamahaFactory implements MotoGpAbstractFactory {
    private String potenza, coppia, rpm;

    public YamahaFactory(String potenza, String coppia, String rpm) {
        this.potenza = potenza;
        this.coppia = coppia;
        this.rpm = rpm;
    }

    @Override
    public MotoGp createMotoGp() {
        return new Yamaha(potenza, coppia, rpm);
    }
}
