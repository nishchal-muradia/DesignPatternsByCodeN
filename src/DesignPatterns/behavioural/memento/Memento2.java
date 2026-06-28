package DesignPatterns.behavioural.memento;

/*
Memento2.java

Now editor can create and restore one snapshot.
*/
public class Memento2 {
    public static void main(String[] args) {
        Editor2 editor = new Editor2();
        editor.setText("Version 1");

        EditorMemento2 saved = editor.save();

        editor.setText("Version 2");
        System.out.println(editor.getText());

        editor.restore(saved);
        System.out.println(editor.getText());
    }
}

class EditorMemento2 {
    private final String text;

    public EditorMemento2(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}

class Editor2 {
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public EditorMemento2 save() {
        return new EditorMemento2(text);
    }

    public void restore(EditorMemento2 memento) {
        text = memento.getText();
    }
}
