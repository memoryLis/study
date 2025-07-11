package com.liang.designpattern.behavior2.command.editor;

// 命令接口
interface Command {
    void execute();
    void undo();
}