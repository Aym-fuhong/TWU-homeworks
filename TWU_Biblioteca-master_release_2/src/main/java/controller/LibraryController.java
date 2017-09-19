package controller;

import constant.Constant;
import constant.Status;
import interfaces.LibraryInterface;
import services.LibraryService;
import tools.IOFilter;

public class LibraryController {
    private LibraryInterface libraryInterface = new LibraryService();
    private Status currentStatus = Status.wait_input;
    private IOFilter ioFilter = new IOFilter();

    public Status getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(Status currentStatus) {
        this.currentStatus = currentStatus;
    }

    public String biblioteca_book(String input) {
        String result = Constant.role;
        ioFilter.setStatus(this, input);
        ioFilter.processExit(this, input);
        switch (this.currentStatus) {
            case custom_main_menu:
                result = Constant.custom_mainMenu;
                this.setCurrentStatus(Status.custom_booklist);
                break;
            case custom_booklist:
                if (ioFilter.isNumber_one(input)) {
                    if (libraryInterface.get_book_list().length() != 0) {
                        result = libraryInterface.get_book_list() + Constant.choose_checkout;
                        this.setCurrentStatus(Status.checkout_book);
                    } else {
                        result = Constant.vacant + Constant.prompt;
                        this.setCurrentStatus(Status.custom_main_menu);
                    }

                } else if (ioFilter.isNumber_two(input)) {
                    if (libraryInterface.get_movie_list().length() != 0) {
                        result = libraryInterface.get_movie_list() + Constant.choose_checkout;
                        this.setCurrentStatus(Status.checkout_movie);
                    } else {
                        result = Constant.vacant + Constant.prompt;
                        this.setCurrentStatus(Status.custom_main_menu);
                    }

                } else if (ioFilter.isNumber_three(input)) {
                    result = Constant.choose_return;
                    this.setCurrentStatus(Status.return_book);
                } else if (ioFilter.isNumber_four(input)) {
                    result = Constant.choose_return;
                    this.setCurrentStatus(Status.return_movie);
                } else {
                    result = Constant.errorMessage;
                }
                break;
            case checkout_book:
                if (ioFilter.isNumber(input)) {
                    libraryInterface.checkout_book(input);
                    result = Constant.checkoutBookSuccessMessage + Constant.role;
                    this.setCurrentStatus(Status.wait_input);
                } else {
                    result = Constant.checkoutBookErrorMessage;
                }
                break;
            case checkout_movie:
                if (ioFilter.isNumber(input)) {
                    libraryInterface.checkout_movie(input);
                    result = Constant.checkoutMovieSuccessMessage + Constant.role;
                    this.setCurrentStatus(Status.wait_input);
                } else {
                    result = Constant.checkoutMovieErrorMessage;
                }
                break;
            case return_book:
                if (ioFilter.isNumber(input)) {
                    if (!libraryInterface.get_book_is_exist(input)) {
                        libraryInterface.return_book(input);
                        result = Constant.returnBookSuccessMessage + Constant.role;
                        this.setCurrentStatus(Status.wait_input);
                    } else {
                        result = Constant.exist_book + Constant.prompt;
                        this.setCurrentStatus(Status.custom_main_menu);
                    }

                } else {
                    result = Constant.returnBookErrorMessage;
                }
                break;
            case return_movie:
                if (ioFilter.isNumber(input)) {
                    if (!libraryInterface.get_movie_is_exist(input)) {
                        libraryInterface.return_movie(input);
                        result = Constant.returnMovieSuccessMessage + Constant.role;
                        this.setCurrentStatus(Status.wait_input);
                    } else {
                        result = Constant.exist_movie + Constant.prompt;
                        this.setCurrentStatus(Status.custom_main_menu);
                    }

                } else {
                    result = Constant.returnMovieErrorMessage;
                }
                break;
            case librarian_main_menu:
                result = Constant.librarian_mainMenu;
                this.setCurrentStatus(Status.librarian_choose);
                break;
            case librarian_choose:
                if (ioFilter.isNumber_one(input)) {
                    if (libraryInterface.get_book_list().length() != 0) {
                        result = libraryInterface.get_book_list() + Constant.prompt;
                        this.setCurrentStatus(Status.custom_main_menu);
                    } else {
                        result = Constant.vacant + Constant.prompt;
                        this.setCurrentStatus(Status.custom_main_menu);
                    }
                } else if (ioFilter.isNumber_two(input)) {
                    if (libraryInterface.get_movie_list().length() != 0) {
                        result = libraryInterface.get_movie_list() + Constant.prompt;
                        this.setCurrentStatus(Status.librarian_main_menu);
                    } else {
                        result = Constant.vacant + Constant.prompt;
                        this.setCurrentStatus(Status.librarian_main_menu);
                    }
                } else {
                    result = Constant.errorMessage;
                }
                break;
            case exit:
                System.exit(0);
                break;
        }

        return result;
    }
}
