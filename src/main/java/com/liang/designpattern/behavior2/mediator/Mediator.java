package com.liang.designpattern.behavior2.mediator;

interface Mediator {
    void send(String message, Colleague colleague);
}