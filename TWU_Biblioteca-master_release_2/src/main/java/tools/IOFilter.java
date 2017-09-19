package tools;

import constant.Status;
import controller.LibraryController;

public class IOFilter {

    public void setStatus(LibraryController libraryController, String input) {
        if (Status.wait_input.equals(libraryController.getCurrentStatus()) && isNumber(input)) {
            switch (input) {
                case "1":
                    libraryController.setCurrentStatus(Status.custom_main_menu);
                    break;
                case "2":
                    libraryController.setCurrentStatus(Status.librarian_main_menu);
                    break;
                case "q":
                    processExit(libraryController, input);
                    break;
            }
        }
    }

    public void processExit(LibraryController libraryController, String input) {
        if (input.trim().equals("q")){
            libraryController.setCurrentStatus(Status.exit);
        }
    }

    public boolean isNumber(String input) {
        return input.trim().matches("[123]");
    }

    public boolean isNumber_one(String input) {
        return input.trim().matches("[1]");
    }

    public boolean isNumber_two(String input) {
        return input.trim().matches("[2]");
    }

    public boolean isNumber_three(String input) {
        return input.trim().matches("[3]");
    }

    public boolean isNumber_four(String input) { return input.trim().matches("[4]"); }
}
