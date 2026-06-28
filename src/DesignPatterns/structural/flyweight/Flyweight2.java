package DesignPatterns.structural.flyweight;

/*
Flyweight2.java

Now TreeType2 stores shared data.

Tree2 stores only unique position.
*/
public class Flyweight2 {
    public static void main(String[] args) {
        TreeType2 mangoType = new TreeType2("Mango", "Green");

        Tree2 tree1 = new Tree2(10, 20, mangoType);
        Tree2 tree2 = new Tree2(30, 40, mangoType);

        tree1.draw();
        tree2.draw();
    }
}

class TreeType2 {
    private final String type;
    private final String color;

    public TreeType2(String type, String color) {
        this.type = type;
        this.color = color;
    }

    public void draw(int x, int y) {
        System.out.println(type + " tree at " + x + "," + y + " color=" + color);
    }
}

class Tree2 {
    private final int x;
    private final int y;
    private final TreeType2 treeType;

    public Tree2(int x, int y, TreeType2 treeType) {
        this.x = x;
        this.y = y;
        this.treeType = treeType;
    }

    public void draw() {
        treeType.draw(x, y);
    }
}
