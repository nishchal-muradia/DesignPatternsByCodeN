package DesignPatterns.structural.flyweight;

/*
Flyweight1.java

Problem:

Every tree stores type and color repeatedly.
If there are thousands of trees, memory usage increases.
*/
public class Flyweight1 {
    public static void main(String[] args) {
        Tree1 tree1 = new Tree1(10, 20, "Mango", "Green");
        Tree1 tree2 = new Tree1(30, 40, "Mango", "Green");

        tree1.draw();
        tree2.draw();
    }
}

class Tree1 {
    private final int x;
    private final int y;
    private final String type;
    private final String color;

    public Tree1(int x, int y, String type, String color) {
        this.x = x;
        this.y = y;
        this.type = type;
        this.color = color;
    }

    public void draw() {
        System.out.println(type + " tree at " + x + "," + y + " color=" + color);
    }
}
