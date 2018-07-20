package com.thinkopen.patterns.creational.factory.abstractfactory;

import com.thinkopen.patterns.creational.factory.motogp.MotoGp;

public class MotoGpFactory {

    public static MotoGp getMotoGp(MotoGpAbstractFactory factory) {
        return factory.createMotoGp();
    }

}
