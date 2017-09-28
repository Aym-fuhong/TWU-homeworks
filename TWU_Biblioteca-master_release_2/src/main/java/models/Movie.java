package models;

public class Movie {
    private int id;
    private String name;
    private String year;
    private String director;
    private String rating;
    private boolean isExist;

    public Movie(int id, String name, String year, String director, String rating, Boolean isExist) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.director = director;
        this.rating = rating;
        this.isExist = isExist;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    public String getDirector() {
        return director;
    }

    public String getRating() {
        return rating;
    }

    public boolean isExist() {
        return isExist;
    }

    public void setExist(boolean exist) {
        isExist = exist;
    }
}
