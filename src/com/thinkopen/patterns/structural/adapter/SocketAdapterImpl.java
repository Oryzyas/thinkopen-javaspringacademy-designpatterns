package com.thinkopen.patterns.structural.adapter;

public class SocketAdapterImpl extends Socket implements SocketAdapter {

    @Override
    public Volt get220Volt() {
        return getVolt();
    }

    @Override
    public Volt get12Volt() {
        return convertVolt(getVolt(), 18);
    }

    @Override
    public Volt get3Volt() {
        return convertVolt(getVolt(), 73);
    }

    private Volt convertVolt(Volt volt, int rate) {
        return new Volt(volt.getVolts() / rate);
    }
}
