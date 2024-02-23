package com.anfilofyev;

import com.anfilofyev.routes.RouteThree;

public class Main {
    public static void main(String[] args) {

        RouteThree route30 = new RouteThree();

        System.out.println(route30.getNumber() + " === " + route30.getStationsList());

        RouteThree route31 = new RouteThree(1230, 1515);

        System.out.println(route31.getNumber() + " === " + route30.getStationsList());

        RouteThree route32 = new RouteThree(1530, 1715, );
    }
}