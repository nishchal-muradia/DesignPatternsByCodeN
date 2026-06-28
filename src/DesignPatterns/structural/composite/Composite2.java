package DesignPatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/*
Composite2.java

Now File and Folder implement the same interface.

Client can call show() without knowing exact type.
*/
public class Composite2 {
    public static void main(String[] args) {
        FileSystemItem2 resume = new FileItem2("resume.pdf");
        FileSystemItem2 photo = new FileItem2("photo.png");

        FolderItem2 documents = new FolderItem2("Documents");
        documents.add(resume);
        documents.add(photo);

        documents.show();
    }
}

interface FileSystemItem2 {
    void show();
}

class FileItem2 implements FileSystemItem2 {
    private final String name;

    public FileItem2(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        System.out.println("File: " + name);
    }
}

class FolderItem2 implements FileSystemItem2 {
    private final String name;
    private final List<FileSystemItem2> items = new ArrayList<FileSystemItem2>();

    public FolderItem2(String name) {
        this.name = name;
    }

    public void add(FileSystemItem2 item) {
        items.add(item);
    }

    @Override
    public void show() {
        System.out.println("Folder: " + name);
        for (FileSystemItem2 item : items) {
            item.show();
        }
    }
}
