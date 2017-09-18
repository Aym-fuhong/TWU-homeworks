package interfaces;

public interface LibraryInterface {

    void checkout_book(String input);
    void return_book(String input);
    boolean get_book_is_exist(String input);
    StringBuffer get_book_list();
    void set_book_list();
}
