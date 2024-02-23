package com.anfilofyev.routes;

import com.anfilofyev.stations.StationsEnum;
import com.anfilofyev.units.transportType;

import java.util.List;

public abstract class Route {

   //public List<StationsEnum> stationsList = new ArrayList<>(EnumSet.of(StationsEnum.Schifflande));\

    int number;

    public transportType getType() {
        return type;
    }

    public void setType(transportType type) {
        this.type = type;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    transportType type;
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

    public Route(int number, List<StationsEnum> stationsList, StationsEnum startStation, StationsEnum endStation, transportType type) {
        this.number = number;
        this.stationsList = stationsList;
        this.startStation = startStation;
        this.endStation = endStation;
        this.type = type;
    }

    public Route(int number, List<StationsEnum> stationsList, StationsEnum startStation, StationsEnum endStation, int startTime, int endTime, transportType type) {
        this.number = number;
        this.stationsList = stationsList;
        this.startStation = startStation;
        this.endStation = endStation;
        this.startTime = startTime;
        this.endTime = endTime;
        this.type = type;
    }
}
