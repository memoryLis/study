package com.liang.designpattern.behabvior.observer;

public class PhoneApp implements Observer {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherStation;

    public PhoneApp(Subject weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("PhoneApp: Temperature: " + temperature + "°C, Humidity: " + humidity + "%, Pressure: " + pressure + " hPa");
    }
}