package com.liang.designpattern.behabvior.observer;


public interface Subject {
    void registerObserver(Observer o);






















    void removeObserver(Observer o);
    void notifyObservers();
}