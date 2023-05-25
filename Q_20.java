//"Write a program, to implement the following hierarchy. Displays information of each class the rectangle represents the classes. The classes Movie and MusicVideo inherits all the members of the class VideoTape."
class VideoTape {
    protected String title;
    protected int duration;

    public VideoTape(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public void play() {
        System.out.println("Playing " + title);
    }

    public void stop() {
        System.out.println("Stopped " + title);
    }
}

class Movie extends VideoTape {
    private String director;

    public Movie(String title, int duration, String director) {
        super(title, duration);
        this.director = director;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Director: " + director);
    }
}

class MusicVideo extends VideoTape {
    private String artist;

    public MusicVideo(String title, int duration, String artist) {
        super(title, duration);
        this.artist = artist;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Artist: " + artist);
    }
}

public class ClassHierarchyExample {
    public static void main(String[] args) {
        Movie movie = new Movie("Inception", 148, "Christopher Nolan");
        movie.displayInfo();
        movie.play();

        System.out.println();

        MusicVideo musicVideo = new MusicVideo("Shape of You", 234, "Ed Sheeran");
        musicVideo.displayInfo();
        musicVideo.play();
    }
}
