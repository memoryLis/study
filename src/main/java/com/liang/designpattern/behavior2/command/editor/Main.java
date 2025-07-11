package com.liang.designpattern.behavior2.command.editor;

/**
 * ClassName: Main
 * Package: com.liang.designpattern.behavior2.command.editor
 * Description:
 *
 * @Author liang
 * @Create 2025/5/17 17:44
 */
public class Main {
    public static void main(String[] args) {
     TextEditor textEditor = new TextEditor();
     textEditor.add("h");
     textEditor.add("g");
     textEditor.add("l");
     textEditor.undo(4);

    }
}
