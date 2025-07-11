package com.liang.designpattern.behavior2.command.editor;

class AddTextCommand implements Command {
    private StringBuilder textEditor;
    private String text;

    public AddTextCommand(StringBuilder textEditor, String text) {
        this.textEditor = textEditor;
        this.text = text;
    }

    public void execute() {
        textEditor.append(text);
    }

    public void undo() {
        textEditor.delete(textEditor.length() - text.length(), textEditor.length());
    }
}