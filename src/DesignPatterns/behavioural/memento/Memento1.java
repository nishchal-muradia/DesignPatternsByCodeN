package DesignPatterns.behavioural.memento;

/*
Memento1.java

Problem:

Once text changes, old text is lost.
*/
public class Memento1 {
    public static void main(String[] args) {
        Editor1 editor = new Editor1();
        editor.setText("Version 1");
        editor.setText("Version 2");

        System.out.println(editor.getText());
    }
}

class Editor1 {
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
