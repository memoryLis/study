package com.liang.designpattern.behavior2.state;

// 在on状态下，去执行以下各种操作
public class TVOnState implements TVState {
    @Override
    public void turnOn() {
        System.out.println("TV is already on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the TV.");
    }

    @Override
    public void adjustVolume(int volume) {
        System.out.println("Adjusting volume to: " + volume);
    }
}

