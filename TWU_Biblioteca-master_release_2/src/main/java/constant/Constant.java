package constant;

public class Constant {

    public static String role = "Welcome to Biblioteca:\n" +
            "1.custom\n" +
            "2.librarian\n" +
            "q.Quit\n" +
            "Please chose your role(1~2/q):";

    public static String librarian_mainMenu = "Welcome to Biblioteca:\n" +
            "1.list books\n" +
            "2.list movies\n" +
            "q.Quit\n" +
            "Please enter your choose(1~2/q):";

    public static String custom_mainMenu = "Welcome to Biblioteca:\n" +
            "1.list books\n" +
            "2.list movies\n" +
            "3.return book\n" +
            "q.Quit\n" +
            "Please enter your choose(1~3/q):";

    public static String vacant = "The library is empty\n";

    public static String exist_book = "This book already exists in the library\n";

    public static String choose_checkout = "Please enter the number your want to checkout:\n";

    public static String choose_return = "Please enter the number your want to return:\n";

    public static String errorMessage = "The input is incorrect. Please enter it again";

    public static String prompt = "Please enter any value to return to the main menu";

    public static String checkoutErrorMessage = "The book is not available!\nPlease checkout it again";

    public static String checkoutSuccessMessage = "Thank you! Enjoy the book.\n";

    public static String returnSuccessMessage = "Thank you for returning the book!\n";

    public static String returnErrorMessage = "That is not a valid book to return!\nPlease return it again";
}
