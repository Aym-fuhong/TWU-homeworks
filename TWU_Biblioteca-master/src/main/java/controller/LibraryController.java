package controller;

import constant.Constant;
import constant.Status;
import tools.IOFilter;

public class LibraryController {

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
                    result = Constant.mainMenu;
                    this.setCurrentStatus(Status.custom_booklist);
                break;
            case custom_booklist:
                if (ioFilter.isNumber_one(input)) {
                    result = Constant.bookList + Constant.choose;
                    this.setCurrentStatus(Status.checkout_book);
                } else {
                    result = Constant.errorMessage;
                }
                break;
            case checkout_book:
                if (ioFilter.isNumber(input)) {
                    result = Constant.checkoutSuccessMessage + Constant.mainMenu;
                    this.setCurrentStatus(Status.custom_booklist);
                } else {
                    result = Constant.checkoutErrorMessage;
                }
                break;
            case librarian_main_menu:
                result = Constant.mainMenu;
                this.setCurrentStatus(Status.librarian_booklist);
                break;
            case librarian_booklist:
                if (ioFilter.isNumber_one(input)){
                    result = Constant.bookList + Constant.prompt;
                    this.setCurrentStatus(Status.custom_main_menu);
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
