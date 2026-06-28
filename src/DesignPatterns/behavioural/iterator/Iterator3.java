package DesignPatterns.behavioural.iterator;

/*
Iterator3.java

Playlist owns the collection.
Playlist gives iterator to the client.
*/
public class Iterator3 {
    public static void main(String[] args) {
        Playlist3 playlist = new Playlist3(new String[]{"Song A", "Song B", "Song C"});
        IteratorExample3 iterator = playlist.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

interface IteratorExample3 {
    boolean hasNext();

    String next();
}

class Playlist3 {
    private final String[] songs;

    public Playlist3(String[] songs) {
        this.songs = songs;
    }

    public IteratorExample3 createIterator() {
        return new PlaylistIterator3(songs);
    }
}

class PlaylistIterator3 implements IteratorExample3 {
    private final String[] songs;
    private int index;

    public PlaylistIterator3(String[] songs) {
        this.songs = songs;
    }

    @Override
    public boolean hasNext() {
        return index < songs.length;
    }

    @Override
    public String next() {
        return songs[index++];
    }
}
