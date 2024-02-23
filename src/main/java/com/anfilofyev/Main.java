package com.anfilofyev;

import com.anfilofyev.routes.RouteThree;
import com.anfilofyev.units.transportType;

public class Main {
    public static void main(String[] args) {


        RouteThree route31 = new RouteThree(1230, 1515, transportType.TRAM);

        System.out.println(route31.getType());
        System.out.println(route31.getStationsList());

    }
}