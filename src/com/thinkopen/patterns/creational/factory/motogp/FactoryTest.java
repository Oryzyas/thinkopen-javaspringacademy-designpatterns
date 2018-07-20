package com.thinkopen.patterns.creational.factory.motogp;

public class FactoryTest {

    public static void main(String[] args) {
        MotoGp moto1 = MotoGpFactory.getMotoGp(MotoGpType.HONDA, "265 Cv", "120 Nm", "19000 g/min");
        MotoGp moto2 = MotoGpFactory.getMotoGp(MotoGpType.DUCATI, "275 Cv", "125 Nm", "20000 g/min");

        System.out.println(moto1);
        System.out.println(moto2);
    }

}
