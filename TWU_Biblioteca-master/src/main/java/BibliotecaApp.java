import constant.Constant;
import controller.LibraryController;

import java.util.Scanner;

public class BibliotecaApp {
    private LibraryController libraryController = new LibraryController();

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Constant.role);
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            String result = libraryController.biblioteca_book(input);
            System.out.println(result);
        }
    }
    public static void main(String[] args) {
        new BibliotecaApp().run();
    }
}
