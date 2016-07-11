package com.mav;

public class MeteoStation {
    public static void main(String[] args) {
        MeteoStationMountin stationMountin = new MeteoStationMountin();
        stationMountin.addObserver(new ConsoleObserver());
        stationMountin.setMeasurements(-35, 770);
    }
}