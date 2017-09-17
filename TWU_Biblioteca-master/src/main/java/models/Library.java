package models;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> bookList = new ArrayList<>();
    private List<Vistor> vistorList = new ArrayList<>();

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public List<Vistor> getVistorList() {
        return vistorList;
    }


}
