package com.mav;

import com.mav.model.ConsoleObserver;
import com.mav.model.FarengateConverter;
import com.mav.model.MeteoStation;

public class Main {
    public static void main(String[] args) {
        MeteoStation stationMountin = new MeteoStation();
        stationMountin.addObserver(new ConsoleObserver());
        stationMountin.addObserver(new FarengateConverter());

        stationMountin.setMeasurements(-35, 770);
    }
}