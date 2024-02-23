package com.anfilofyev.routes;

import com.anfilofyev.stations.Station;
import com.anfilofyev.stations.StationsEnum;

import java.util.List;

public class Route {

   //public List<StationsEnum> stationsList = new ArrayList<>(EnumSet.of(StationsEnum.Schifflande));\

    int number;
    List<StationsEnum> stationsList;

    StationsEnum startStation;

    StationsEnum endStation;

    public Route(int number, List<StationsEnum> stationsList, StationsEnum startStation, StationsEnum endStation) {
        this.number = number;
        this.stationsList = stationsList;
        this.startStation = startStation;
        this.endStation = endStation;
    }

}
