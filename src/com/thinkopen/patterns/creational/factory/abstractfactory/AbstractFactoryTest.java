package com.thinkopen.patterns.creational.factory.abstractfactory;
import com.thinkopen.patterns.creational.factory.motogp.MotoGp;

public class AbstractFactoryTest {

    public static void main(String[] args) {
        //MotoGpFactory.getMotoGp(() -> create("A", "B", "C"));

        MotoGp moto1 = MotoGpFactory.getMotoGp(new YamahaFactory("130 cv", "130 Nm", "2000 g/min"));

        System.out.println(moto1);
    }

}
