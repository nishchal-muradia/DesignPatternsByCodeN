package DesignPatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/*
Flyweight3.java

Factory reuses TreeType3 objects.

If Mango-Green already exists, factory returns the same object.
*/
public class Flyweight3 {
    public static void main(String[] args) {
        TreeType3 mango1 = TreeTypeFactory3.getTreeType("Mango", "Green");
        TreeType3 mango2 = TreeTypeFactory3.getTreeType("Mango", "Green");

        System.out.println(mango1 == mango2);

        new Tree3(10, 20, mango1).draw();
        new Tree3(30, 40, mango2).draw();
    }
}

class TreeType3 {
    private final String type;
    private final String color;

    public TreeType3(String type, String color) {
        this.type = type;
        this.color = color;
    }

    public void draw(int x, int y) {
        System.out.println(type + " tree at " + x + "," + y + " color=" + color);
    }
}

class TreeTypeFactory3 {
    private static final Map<String, TreeType3> cache = new HashMap<String, TreeType3>();

    public static TreeType3 getTreeType(String type, String color) {
        String key = type + "-" + color;
        TreeType3 treeType = cache.get(key);

        if (treeType == null) {
            treeType = new TreeType3(type, color);
            cache.put(key, treeType);
            System.out.println("Created new tree type: " + key);
        }

        return treeType;
    }
}

class Tree3 {
    private final int x;
    private final int y;
    private final TreeType3 treeType;

    public Tree3(int x, int y, TreeType3 treeType) {
        this.x = x;
        this.y = y;
        this.treeType = treeType;
    }

    public void draw() {
        treeType.draw(x, y);
    }
}
