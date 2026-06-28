package DesignPatterns.behavioural.iterator.miniProject;

public class App {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addSong("Believer");
        playlist.addSong("Perfect");
        playlist.addSong("Faded");

        SongIterator iterator = playlist.iterator();

        while (iterator.hasNext()) {
            System.out.println("Playing: " + iterator.next());
        }
    }
}

interface SongIterator {
    boolean hasNext();

    String next();
}

class Playlist {
    private final String[] songs = new String[10];
    private int count;

    public void addSong(String song) {
        songs[count++] = song;
    }

    public SongIterator iterator() {
        return new PlaylistIterator(songs, count);
    }
}

class PlaylistIterator implements SongIterator {
    private final String[] songs;
    private final int count;
    private int index;

    public PlaylistIterator(String[] songs, int count) {
        this.songs = songs;
        this.count = count;
    }

    @Override
    public boolean hasNext() {
        return index < count;
    }

    @Override
    public String next() {
        return songs[index++];
    }
}
