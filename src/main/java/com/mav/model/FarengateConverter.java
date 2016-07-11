package com.mav.model;

public class FarengateConverter implements Observer {
    double temp;
    int pressure;

    @Override
    public void handleEvent(int temp, int pressure) {
        this.temp = temp * 1.8 + 32;
        this.pressure = pressure * 101325 / 760;
        System.out.println("Изменения в погоде. Температура в Фаренгейтах: " + this.temp +
                ", Давление КилоПаскалях: " + this.pressure);
    }
}
