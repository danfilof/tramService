package com.anfilofyev.units;

public enum transportType {
    TRAM(70),
    BUS(70),
    TRAIN(300);

    private int capacity;

    private transportType(int capacity) {
        this.capacity = capacity;
    }

}
