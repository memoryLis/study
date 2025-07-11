package com.liang.designpattern.behavior2.state;

public interface TVState {
    void turnOn();
    void turnOff();
    void adjustVolume(int volume);
}