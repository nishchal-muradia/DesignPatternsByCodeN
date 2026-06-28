package DesignPatterns.structural.composite;

/*
Composite1.java

Problem:

File and folder are treated differently.
Client code needs separate logic.
*/
public class Composite1 {
    public static void main(String[] args) {
        FileItem1 file = new FileItem1("resume.pdf");
        FolderItem1 folder = new FolderItem1("Documents");

        file.showFile();
        folder.showFolder();
    }
}

class FileItem1 {
    private final String name;

    public FileItem1(String name) {
        this.name = name;
    }

    public void showFile() {
        System.out.println("File: " + name);
    }
}

class FolderItem1 {
    private final String name;

    public FolderItem1(String name) {
        this.name = name;
    }

    public void showFolder() {
        System.out.println("Folder: " + name);
    }
}
