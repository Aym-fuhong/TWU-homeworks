package models;

public class Book {
    private String name;
    private String author;
    private String publicDate;

    public Book(String name, String author, String publicDate) {
        this.name = name;
        this.author = author;
        this.publicDate = publicDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublicDate() {
        return publicDate;
    }

    public void setPublicDate(String publicDate) {
        this.publicDate = publicDate;
    }
}
