package com.anfilofyev;

import com.anfilofyev.routes.RouteThree;

public class Main {
    public static void main(String[] args) {

        RouteThree route30 = new RouteThree();

        System.out.println(route30.getNumber() + " === " + route30.getStationsList());
    }
}