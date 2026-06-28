package DesignPatterns.behavioural.iterator;

/*
Iterator2.java

Now traversal is handled by SongIterator2.
*/
public class Iterator2 {
    public static void main(String[] args) {
        SongIterator2 iterator = new SongIterator2(new String[]{"Song A", "Song B", "Song C"});

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

class SongIterator2 {
    private final String[] songs;
    private int index;

    public SongIterator2(String[] songs) {
        this.songs = songs;
    }

    public boolean hasNext() {
        return index < songs.length;
    }

    public String next() {
        return songs[index++];
    }
}
