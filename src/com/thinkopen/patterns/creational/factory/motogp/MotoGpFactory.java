package com.thinkopen.patterns.creational.factory.motogp;

public class MotoGpFactory {

    public static MotoGp getMotoGp(MotoGpType type, String potenza, String coppia, String rpm) {
        switch (type) {
            case HONDA:
                return new Honda(potenza, coppia, rpm);
            case YAMAHA:
                return new Yamaha(potenza, coppia, rpm);
            case DUCATI:
                return new Ducati(potenza, coppia, rpm);
        }

        return null;
    }

}
