package interfaces;

public interface LibraryInterface {

    void checkout_book(String input);
    void checkout_movie(String input);
    void return_book(String input);
    boolean get_book_is_exist(String input);
    StringBuffer get_book_list();
    StringBuffer get_movie_list();
    void set_book_list();
    void set_movie_list();
    boolean get_movie_is_exist(String input);

    void return_movie(String input);
}
