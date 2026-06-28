package DesignPatterns.behavioural.memento.miniProject;

import java.util.Stack;

public class App {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        EditorHistory history = new EditorHistory();

        editor.write("Hello");
        history.save(editor.save());

        editor.write("Hello Design Patterns");
        history.save(editor.save());

        editor.write("Hello Design Patterns in Java");
        System.out.println(editor.getContent());

        editor.restore(history.undo());
        System.out.println(editor.getContent());
    }
}

class EditorState {
    private final String content;

    public EditorState(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

class TextEditor {
    private String content = "";

    public void write(String content) {
        this.content = content;
    }

    public EditorState save() {
        return new EditorState(content);
    }

    public void restore(EditorState state) {
        content = state.getContent();
    }

    public String getContent() {
        return content;
    }
}

class EditorHistory {
    private final Stack<EditorState> history = new Stack<EditorState>();

    public void save(EditorState state) {
        history.push(state);
    }

    public EditorState undo() {
        return history.pop();
    }
}
