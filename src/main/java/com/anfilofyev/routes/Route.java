package com.anfilofyev.routes;

import com.anfilofyev.stations.Station;
import com.anfilofyev.stations.StationsEnum;
import com.anfilofyev.units.TransportUnit;

import java.util.List;

public abstract class Route {

   //public List<StationsEnum> stationsList = new ArrayList<>(EnumSet.of(StationsEnum.Schifflande));\

    int number;

    TransportUnit unit;
    List<StationsEnum> stationsList;

    StationsEnum startStation;

    StationsEnum endStation;

    int startTime;

    int endTime;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<StationsEnum> getStationsList() {
        return stationsList;
    }

    public void setStationsList(List<StationsEnum> stationsList) {
        this.stationsList = stationsList;
    }

    public StationsEnum getStartStation() {
        return startStation;
    }

    public void setStartStation(StationsEnum startStation) {
        this.startStation = startStation;
    }

    public StationsEnum getEndStation() {
        return endStation;
    }

    public void setEndStation(StationsEnum endStation) {
        this.endStation = endStation;
    }

    public Route(int number, List<StationsEnum> stationsList, StationsEnum startStation, StationsEnum endStation, int startTime, int endTime) {
        this.number = number;
        this.stationsList = stationsList;
        this.startStation = startStation;
        this.endStation = endStation;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Route(int number, List<StationsEnum> stationsList, StationsEnum startStation, StationsEnum endStation) {
        this.number = number;
        this.stationsList = stationsList;
        this.startStation = startStation;
        this.endStation = endStation;
    }

    public Route(int number, List<StationsEnum> stationsList, StationsEnum startStation, StationsEnum endStation, TransportUnit unit) {
        this.number = number;
        this.stationsList = stationsList;
        this.startStation = startStation;
        this.endStation = endStation;
        this.unit = unit;
    }

    public Route(int number, List<StationsEnum> stationsList, StationsEnum startStation, StationsEnum endStation, int startTime, int endTime, TransportUnit unit) {
        this.number = number;
        this.stationsList = stationsList;
        this.startStation = startStation;
        this.endStation = endStation;
        this.startTime = startTime;
        this.endTime = endTime;
        this.unit = unit;
    }
}
