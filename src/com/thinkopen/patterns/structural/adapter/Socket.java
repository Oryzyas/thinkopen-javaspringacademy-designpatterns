package com.thinkopen.patterns.structural.adapter;

public class Socket {

    public Volt getVolt() {
        return new Volt(220);
    }

}
