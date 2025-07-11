package com.liang.designpattern.behavior2.memento;

// 备忘录类
class Memento {
    private final String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}