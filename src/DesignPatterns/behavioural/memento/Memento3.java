package DesignPatterns.behavioural.memento;

import java.util.Stack;

/*
Memento3.java

History stores multiple snapshots.
*/
public class Memento3 {
    public static void main(String[] args) {
        Editor3 editor = new Editor3();
        History3 history = new History3();

        editor.setText("Version 1");
        history.push(editor.save());

        editor.setText("Version 2");
        history.push(editor.save());

        editor.setText("Version 3");
        System.out.println(editor.getText());

        editor.restore(history.pop());
        System.out.println(editor.getText());
    }
}

class EditorMemento3 {
    private final String text;

    public EditorMemento3(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}

class Editor3 {
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public EditorMemento3 save() {
        return new EditorMemento3(text);
    }

    public void restore(EditorMemento3 memento) {
        text = memento.getText();
    }
}

class History3 {
    private final Stack<EditorMemento3> states = new Stack<EditorMemento3>();

    public void push(EditorMemento3 memento) {
        states.push(memento);
    }

    public EditorMemento3 pop() {
        return states.pop();
    }
}
