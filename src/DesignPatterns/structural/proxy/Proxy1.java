package DesignPatterns.structural.proxy;

/*
Proxy1.java

Problem:

RealImage1 loads immediately when object is created.
This can be costly if image is never displayed.
*/
public class Proxy1 {
    public static void main(String[] args) {
        RealImage1 image = new RealImage1("profile.png");
        System.out.println("Image object created");
        image.display();
    }
}

class RealImage1 {
    private final String fileName;

    public RealImage1(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading image from disk: " + fileName);
    }

    public void display() {
        System.out.println("Displaying image: " + fileName);
    }
}
