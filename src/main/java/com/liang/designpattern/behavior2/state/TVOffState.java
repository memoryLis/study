package com.liang.designpattern.behavior2.state;

// 在关机的状态下执行以下的操作
public class TVOffState implements TVState {
    @Override
    public void turnOn() {
        System.out.println("Turning on the TV.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is already off.");
    }

    @Override
    public void adjustVolume(int volume) {
        System.out.println("Cannot adjust volume, TV is off.");
    }
}