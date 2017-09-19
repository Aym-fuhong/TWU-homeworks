package status;

import constant.Constant;
import controller.LibraryController;
import interfaces.LibraryInterface;
import services.LibraryService;
import tools.IOFilter;

public class Status {
    private LibraryInterface libraryInterface = new LibraryService();

    public String custom_main_menu(LibraryController libraryController) {
        String result = "";
        result = Constant.custom_mainMenu;
        libraryController.setCurrentStatus(constant.Status.custom_choose);
        return result;
    }

    public String custom_choose(LibraryController libraryController, String input) {
        String result = "";
        if (IOFilter.isNumber_one(input)) {
            if (libraryInterface.get_book_list().length() != 0) {
                result = libraryInterface.get_book_list() + Constant.choose_checkout;
                libraryController.setCurrentStatus(constant.Status.checkout_book);
            } else {
                result = Constant.vacant + Constant.prompt;
                libraryController.setCurrentStatus(constant.Status.custom_main_menu);
            }

        } else if (IOFilter.isNumber_two(input)) {
            if (libraryInterface.get_movie_list().length() != 0) {
                result = libraryInterface.get_movie_list() + Constant.choose_checkout;
                libraryController.setCurrentStatus(constant.Status.checkout_movie);
            } else {
                result = Constant.vacant + Constant.prompt;
                libraryController.setCurrentStatus(constant.Status.custom_main_menu);
            }

        } else if (IOFilter.isNumber_three(input)) {
            result = Constant.choose_return;
            libraryController.setCurrentStatus(constant.Status.return_book);
        } else if (IOFilter.isNumber_four(input)) {
            result = Constant.choose_return;
            libraryController.setCurrentStatus(constant.Status.return_movie);
        } else {
            result = Constant.errorMessage;
        }
        return result;
    }

    public String checkout_book(LibraryController libraryController, String input) {
        String result = "";
        if (IOFilter.isNumber(input)) {
            libraryInterface.checkout_book(input);
            result = Constant.checkoutBookSuccessMessage + Constant.role;
            libraryController.setCurrentStatus(constant.Status.wait_input);
        } else {
            result = Constant.checkoutBookErrorMessage;
        }
        return result;
    }

    public String checkout_movie(LibraryController libraryController, String input) {
        String result = "";
        if (IOFilter.isNumber(input)) {
            libraryInterface.checkout_movie(input);
            result = Constant.checkoutMovieSuccessMessage + Constant.role;
            libraryController.setCurrentStatus(constant.Status.wait_input);
        } else {
            result = Constant.checkoutMovieErrorMessage;
        }
        return result;
    }

    public String return_book(LibraryController libraryController, String input) {
        String result = "";
        if (IOFilter.isNumber(input)) {
            if (!libraryInterface.get_book_is_exist(input)) {
                libraryInterface.return_book(input);
                result = Constant.returnBookSuccessMessage + Constant.role;
                libraryController.setCurrentStatus(constant.Status.wait_input);
            } else {
                result = Constant.exist_book + Constant.prompt;
                libraryController.setCurrentStatus(constant.Status.custom_main_menu);
            }

        } else {
            result = Constant.returnBookErrorMessage;
        }
        return result;
    }

    public String return_movie(LibraryController libraryController, String input) {
        String result = "";
        if (IOFilter.isNumber(input)) {
            if (!libraryInterface.get_movie_is_exist(input)) {
                libraryInterface.return_movie(input);
                result = Constant.returnMovieSuccessMessage + Constant.role;
                libraryController.setCurrentStatus(constant.Status.wait_input);
            } else {
                result = Constant.exist_movie + Constant.prompt;
                libraryController.setCurrentStatus(constant.Status.custom_main_menu);
            }

        } else {
            result = Constant.returnMovieErrorMessage;
        }
        return result;
    }

    public String librarian_main_menu(LibraryController libraryController) {
        String result = "";
        result = Constant.librarian_mainMenu;
        libraryController.setCurrentStatus(constant.Status.librarian_choose);
        return result;
    }

    public String librarian_choose(LibraryController libraryController, String input) {
        String result = "";
        if (IOFilter.isNumber_one(input)) {
            if (libraryInterface.get_book_list().length() != 0) {
                result = libraryInterface.get_book_list() + Constant.prompt;
                libraryController.setCurrentStatus(constant.Status.custom_main_menu);
            } else {
                result = Constant.vacant + Constant.prompt;
                libraryController.setCurrentStatus(constant.Status.custom_main_menu);
            }
        } else if (IOFilter.isNumber_two(input)) {
            if (libraryInterface.get_movie_list().length() != 0) {
                result = libraryInterface.get_movie_list() + Constant.prompt;
                libraryController.setCurrentStatus(constant.Status.librarian_main_menu);
            } else {
                result = Constant.vacant + Constant.prompt;
                libraryController.setCurrentStatus(constant.Status.librarian_main_menu);
            }
        } else {
            result = Constant.errorMessage;
        }
        return result;
    }
}
