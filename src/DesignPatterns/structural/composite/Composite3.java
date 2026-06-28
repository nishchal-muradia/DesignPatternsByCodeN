package DesignPatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/*
Composite3.java

Composite can represent nested tree structures.

Folder can contain:
- File
- Folder

Both follow the same interface.
*/
public class Composite3 {
    public static void main(String[] args) {
        Folder3 root = new Folder3("Root");
        Folder3 src = new Folder3("src");
        Folder3 test = new Folder3("test");

        src.add(new File3("App.java"));
        src.add(new File3("User.java"));
        test.add(new File3("AppTest.java"));

        root.add(src);
        root.add(test);

        root.show("");
    }
}

interface Item3 {
    void show(String space);
}

class File3 implements Item3 {
    private final String name;

    public File3(String name) {
        this.name = name;
    }

    @Override
    public void show(String space) {
        System.out.println(space + "File: " + name);
    }
}

class Folder3 implements Item3 {
    private final String name;
    private final List<Item3> items = new ArrayList<Item3>();

    public Folder3(String name) {
        this.name = name;
    }

    public void add(Item3 item) {
        items.add(item);
    }

    @Override
    public void show(String space) {
        System.out.println(space + "Folder: " + name);
        for (Item3 item : items) {
            item.show(space + "  ");
        }
    }
}
