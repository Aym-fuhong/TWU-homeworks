package controller;

import constant.Constant;
import status.Status;
import tools.IOFilter;

public class LibraryController {
    private constant.Status currentStatus = constant.Status.wait_input;
    private Status status = new Status();

    public constant.Status getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(constant.Status currentStatus) {
        this.currentStatus = currentStatus;
    }

    public String biblioteca_book(String input) {
        String result = Constant.role;
        IOFilter.setStatus(this, input);
        IOFilter.processExit(this, input);
        switch (this.currentStatus) {
            case custom_main_menu:
                result = status.custom_main_menu(this);
                break;
            case custom_choose:
                result = status.custom_choose(this, input);
                break;
            case checkout_book:
                result = status.checkout_book(this, input);
                break;
            case checkout_movie:
                result = status.checkout_movie(this, input);
                break;
            case return_book:
                result = status.return_book(this, input);
                break;
            case return_movie:
                result = status.return_movie(this, input);
                break;
            case librarian_main_menu:
                result = status.librarian_main_menu(this);
                break;
            case librarian_choose:
                result = status.librarian_choose(this, input);
                break;
            case exit:
                System.exit(0);
                break;
        }

        return result;
    }
}
