package tools;

import constant.Status;
import controller.LibraryController;

public class IOFilter {

    public static void setStatus(LibraryController libraryController, String input) {
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

    public static void processExit(LibraryController libraryController, String input) {
        if (input.trim().equals("q")){
            libraryController.setCurrentStatus(Status.exit);
        }
    }

    public static boolean isNumber(String input) {
        return input.trim().matches("[123]");
    }

    public static boolean isNumber_one(String input) {
        return input.trim().matches("[1]");
    }

    public static boolean isNumber_two(String input) {
        return input.trim().matches("[2]");
    }

    public static boolean isNumber_three(String input) {
        return input.trim().matches("[3]");
    }

    public static boolean isNumber_four(String input) { return input.trim().matches("[4]"); }
}
