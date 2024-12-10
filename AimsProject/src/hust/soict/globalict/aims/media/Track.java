package hust.soict.globalict.aims.media;

public class Track implements Playable{
    private String title;
    private int length;

    // Constructor
    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Track) {
            Track track = (Track) obj;
            return this.title.equalsIgnoreCase(track.title) && this.length == track.length;
        }
        return false;
    }
    @Override
    public void play() {
        System.out.println("Playing Track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
    }

}
