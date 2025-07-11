package com.liang.designpattern.behavior2.command;

public class Main {
    public static void main(String[] args) {
        // 创建一个灯
        Light light = new Light();
        // 创建一个开灯命令
        Command lightOnCommand = new LightOnCommand(light);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(lightOnCommand);
        remoteControl.pressButton();
    }
}
