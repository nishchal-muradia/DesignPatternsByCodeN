package DesignPatterns.structural.proxy;

/*
Proxy2.java

Proxy delays real image loading until display is actually called.
*/
public class Proxy2 {
    public static void main(String[] args) {
        Image2 image = new ImageProxy2("profile.png");
        System.out.println("Proxy object created");

        image.display();
        image.display();
    }
}

interface Image2 {
    void display();
}

class RealImage2 implements Image2 {
    private final String fileName;

    public RealImage2(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading image from disk: " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + fileName);
    }
}

class ImageProxy2 implements Image2 {
    private final String fileName;
    private RealImage2 realImage;

    public ImageProxy2(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage2(fileName);
        }
        realImage.display();
    }
}
