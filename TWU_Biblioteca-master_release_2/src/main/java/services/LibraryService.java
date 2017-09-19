package services;

import interfaces.LibraryInterface;
import models.Book;
import models.Library;
import models.Movie;

import java.util.ArrayList;
import java.util.List;

public class LibraryService implements LibraryInterface {

    private Library library = new Library();

    public LibraryService() {
        this.set_book_list();
        this.set_movie_list();
    }

    @Override
    public void checkout_book(String input) {
        int inputValue = Integer.parseInt(input);
        List<Book> bookList = library.getBookList();
        for (int i = 0; i < bookList.size(); i++) {
           if ( inputValue == i + 1){
               bookList.get(i).setExist(false);
           }
        }
    }

    @Override
    public void checkout_movie(String input) {
        int inputValue = Integer.parseInt(input);
        List<Movie> movieList = library.getMovieList();
        for (int i = 0; i < movieList.size(); i++) {
            if ( inputValue ==movieList.get(i).getId()){
                movieList.get(i).setExist(false);
            }
        }
    }

    @Override
    public void return_book(String input) {
        int inputValue = Integer.parseInt(input);
        List<Book> bookList = library.getBookList();
        for (int i = 0; i < bookList.size(); i++) {
            if ( inputValue == i + 1){
                bookList.get(i).setExist(true);
            }
        }
    }

    @Override
    public boolean get_book_is_exist(String input) {
        boolean isExist = false;
        int inputValue = Integer.parseInt(input);
        List<Book> bookList = library.getBookList();
        for (int i = 0; i < bookList.size(); i++) {
            if ( inputValue == i + 1 && bookList.get(i).isExist()){
                isExist = true;
            }
        }
        return isExist;
    }

    @Override
    public StringBuffer get_book_list() {
        List<Book> bookList = library.getBookList();
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).isExist()) {
                result.append(i + 1);
                result.append(".\n");
                result.append("  ");
                result.append("书名: ");
                result.append(bookList.get(i).getName());
                result.append("\n");
                result.append("  ");
                result.append("作者: ");
                result.append(bookList.get(i).getAuthor());
                result.append("\n");
                result.append("  ");
                result.append("出版日期: ");
                result.append(bookList.get(i).getPublicDate());
                result.append("\n");
            }
        }
        return result;
    }

    @Override
    public StringBuffer get_movie_list() {
        List<Movie> movieList = library.getMovieList();
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < movieList.size(); i++) {
            if (movieList.get(i).isExist()) {
                result.append(movieList.get(i).getId());
                result.append(".\n");
                result.append("  ");
                result.append("电影名: ");
                result.append(movieList.get(i).getName());
                result.append("\n");
                result.append("  ");
                result.append("导演: ");
                result.append(movieList.get(i).getDirector());
                result.append("\n");
                result.append("  ");
                result.append("出版日期: ");
                result.append(movieList.get(i).getYear());
                result.append("\n");
                result.append("  ");
                result.append("评分: ");
                result.append(movieList.get(i).getRating());
                result.append("\n");
            }
        }
        return result;
    }

    @Override
    public void set_book_list() {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("代码整洁之道", "martin", "2017-9-15", true));
        bookList.add(new Book("重构到模式", "martin", "2017-9-15", true));
        bookList.add(new Book("程序员的思维修养", "martin", "2017-9-15", true));
        library.setBookList(bookList);
    }

    @Override
    public void set_movie_list() {
        List<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie(1, "《西游记》", "2017-4-1", "2017-9-15", "9", true));
        movieList.add(new Movie(2, "《红楼梦》", "2017-4-1", "2017-9-15", "10", true));
        movieList.add(new Movie(3, "《水浒传》", "2017-4-1", "2017-9-15", "unrated", true));
        library.setMovieList(movieList);
    }

    @Override
    public boolean get_movie_is_exist(String input) {
        boolean isExist = false;
        int inputValue = Integer.parseInt(input);
        List<Movie> movieList = library.getMovieList();
        for (int i = 0; i < movieList.size(); i++) {
            if ( inputValue ==  movieList.get(i).getId() && movieList.get(i).isExist()){
                isExist = true;
            }
        }
        return isExist;
    }

    @Override
    public void return_movie(String input) {
        int inputValue = Integer.parseInt(input);
        List<Movie> movieList = library.getMovieList();
        for (int i = 0; i < movieList.size(); i++) {
            if ( inputValue == movieList.get(i).getId()){
                movieList.get(i).setExist(true);
            }
        }
    }
}
