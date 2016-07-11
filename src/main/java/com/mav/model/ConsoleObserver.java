package com.mav.model;

public class ConsoleObserver implements Observer {
    @Override
    public void handleEvent(int temp, int pressure) {
        System.out.println("Изменения в погоде. Температура: " + temp + ", Давление: " + pressure);
    }
}
