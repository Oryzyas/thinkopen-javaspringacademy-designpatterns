package com.thinkopen.patterns.structural.adapter;

public class AdapterTest {

    public static void main(String[] args) {
        SocketAdapter sa = new SocketAdapterImpl();

        Volt v3 = getVolts(sa, 3);
        Volt v12 = getVolts(sa, 12);
        Volt v220 = getVolts(sa, 220);

        System.out.println("3V ottenuti dall'adapter: " + v3.getVolts());
        System.out.println("12V ottenuti dall'adapter: " + v12.getVolts());
        System.out.println("220V ottenuti dall'adapter: " + v220.getVolts());
    }

    private static Volt getVolts(SocketAdapter sa, int i) {
        switch (i) {
            case 3:
                return sa.get3Volt();
            case 12:
                return sa.get12Volt();
            default:
                return sa.get220Volt();
        }
    }
}
