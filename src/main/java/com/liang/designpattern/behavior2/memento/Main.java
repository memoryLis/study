package com.liang.designpattern.behavior2.memento;

public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        // 设置状态并保存到备忘录
        originator.setState("State1");
        caretaker.add(originator.saveStateToMemento());

        originator.setState("State2");
        caretaker.add(originator.saveStateToMemento());

        // 从备忘录中恢复状态
        originator.getStateFromMemento(caretaker.get(0));
        System.out.println("恢复的状态: " + originator.getState()); // 输出：恢复的状态: State1

        originator.getStateFromMemento(caretaker.get(1));
        System.out.println("恢复的状态: " + originator.getState()); // 输出：恢复的状态: State2
    }
}