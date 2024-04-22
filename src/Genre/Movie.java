package Genre;

public class Movie {

    private String title;
    private Genre genre;

    public Movie(String title, Genre genre) {
        setTitle(title);
        setGenre(genre);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre){
        this.genre = genre;
    }

}
