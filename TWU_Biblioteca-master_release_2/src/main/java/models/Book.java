package models;

public class Book {
    private String name;
    private String author;
    private String publicDate;
    private boolean exist;

    public void setExist(boolean exist) {
        this.exist = exist;
    }

    public boolean isExist() {
        return exist;
    }

    public Book(String name, String author, String publicDate, boolean exist) {
        this.name = name;
        this.author = author;
        this.publicDate = publicDate;
        this.exist = exist;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublicDate() {
        return publicDate;
    }


}
