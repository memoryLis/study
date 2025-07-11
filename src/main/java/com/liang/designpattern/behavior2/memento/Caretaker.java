package com.liang.designpattern.behavior2.memento;

import java.util.ArrayList;
import java.util.List;

// 负责人类
class Caretaker {
    private final List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}