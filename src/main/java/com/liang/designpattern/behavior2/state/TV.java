package com.liang.designpattern.behavior2.state;

public class TV {
    // 当前状态
    private TVState state;

    public TV() {
        state = new TVOffState();
    }

    public void setState(TVState state) {
        this.state = state;
    }

    public void turnOn() {
        // 打开
        state.turnOn();
        // 设置为开机状态
        setState(new TVOnState());
    }

    public void turnOff() {
        // 关闭
        state.turnOff();
        // 设置为关机状态
        setState(new TVOffState());
    }

    public void adjustVolume(int volume) {
        state.adjustVolume(volume);
    }
}