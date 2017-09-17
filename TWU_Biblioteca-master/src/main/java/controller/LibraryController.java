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
                    result = Constant.bookList + Constant.choose_checkout;
                    this.setCurrentStatus(Status.checkout_book);
                } else if (ioFilter.isNumber_three(input)) {
                    result = Constant.choose_return;
                    this.setCurrentStatus(Status.return_book);
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
            case return_book:
                if (ioFilter.isNumber(input)) {
                    result = Constant.returnSuccessMessage + Constant.mainMenu;
                    this.setCurrentStatus(Status.custom_booklist);
                } else {
                    result = Constant.returnErrorMessage;
                }
                break;
            case librarian_main_menu:
                result = Constant.librarian_mainMenu;
                this.setCurrentStatus(Status.librarian_booklist);
                break;
            case librarian_booklist:
                if (ioFilter.isNumber_one(input)) {
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
