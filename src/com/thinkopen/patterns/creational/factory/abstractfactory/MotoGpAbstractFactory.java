package com.thinkopen.patterns.creational.factory.abstractfactory;

import com.thinkopen.patterns.creational.factory.motogp.MotoGp;

public interface MotoGpAbstractFactory {

    MotoGp createMotoGp();

    /*
    static MotoGp create(String potenza, String coppia, String rpm) {
        return new MotoGp() {
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
        };
    }*/
}
