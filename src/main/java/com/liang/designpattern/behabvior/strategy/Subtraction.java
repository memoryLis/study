package com.liang.designpattern.behabvior.strategy;

public class Subtraction implements Operation {
    @Override
    public double execute(double num1, double num2) {
        return num1 - num2;
    }
}