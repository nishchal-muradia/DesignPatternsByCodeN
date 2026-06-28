package DesignPatterns.behavioural.iterator;

/*
Iterator1.java

Problem:

Client directly knows that songs are stored in an array.
*/
public class Iterator1 {
    public static void main(String[] args) {
        String[] songs = {"Song A", "Song B", "Song C"};

        for (int i = 0; i < songs.length; i++) {
            System.out.println(songs[i]);
        }
    }
}
