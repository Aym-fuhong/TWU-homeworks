import constant.Status;
import controller.LibraryController;
import org.junit.After;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class LibraryControllerTest {

    private LibraryController libraryController = new LibraryController();

    @Test
    public void app_run_case_1() throws Exception {
        String input = "1";
        String expect = "Welcome to Biblioteca:\n" +
                "1.list books\n" +
                "2.list movies\n" +
                "3.return book\n" +
                "q.Quit\n" +
                "Please enter your choose(1~3/q):";
        this.should_return_assertThat_when_input_test_data(input, expect);
    }

    @Test
    public void app_run_case_2() throws Exception {
        String input = "2";
        String expect = "Welcome to Biblioteca:\n" +
                "1.list books\n" +
                "2.list movies\n" +
                "q.Quit\n" +
                "Please enter your choose(1~2/q):";
        this.should_return_assertThat_when_input_test_data(input, expect);
    }

    @Test
    public void app_run_case_3() throws Exception {
        libraryController.setCurrentStatus(Status.custom_booklist);
        String input = "1";
        String expect = "1.\n" +
                "  书名: 代码整洁之道\n" +
                "  作者: martin\n" +
                "  出版日期: 2017-9-15\n" +
                "2.\n" +
                "  书名: 重构到模式\n" +
                "  作者: martin\n" +
                "  出版日期: 2017-9-15\n" +
                "3.\n" +
                "  书名: 程序员的思维修养\n" +
                "  作者: martin\n" +
                "  出版日期: 2017-9-15\n" +
                "Please enter the number your want to checkout:\n";
        this.should_return_assertThat_when_input_test_data(input, expect);
    }

    @Test
    public void app_run_case_4() throws Exception {
        libraryController.setCurrentStatus(Status.custom_booklist);
        String input = "4";
        String expect = "The input is incorrect. Please enter it again";
        this.should_return_assertThat_when_input_test_data(input, expect);
    }

    @Test
    public void app_run_case_5() throws Exception {
        libraryController.setCurrentStatus(Status.custom_booklist);
        String input = "3";
        String expect = "Please enter the number your want to return:\n";
        this.should_return_assertThat_when_input_test_data(input, expect);
    }

    @Test
    public void app_run_case_6() throws Exception {
        libraryController.setCurrentStatus(Status.checkout_book);
        String input = "1";
        String expect = "Thank you! Enjoy the book.\n" +
                "Welcome to Biblioteca:\n" +
                "1.custom\n" +
                "2.librarian\n" +
                "q.Quit\n" +
                "Please chose your role(1~2/q):";
        this.should_return_assertThat_when_input_test_data(input, expect);
    }

    @Test
    public void app_run_case_7() throws Exception {
        libraryController.setCurrentStatus(Status.checkout_book);
        String input = "6";
        String expect = "The book is not available!\nPlease checkout it again";
        this.should_return_assertThat_when_input_test_data(input, expect);
    }

    @Test
    public void app_run_case_8() throws Exception {
        libraryController.setCurrentStatus(Status.return_book);
        String input = "2";
        String expect = "This book already exists in the library\n" +
                "Please enter any value to return to the main menu";
        this.should_return_assertThat_when_input_test_data(input, expect);
    }

    @Test
    public void app_run_case_9() throws Exception {
        libraryController.setCurrentStatus(Status.return_book);
        String input = "6";
        String expect = "That is not a valid book to return!\nPlease return it again";
        this.should_return_assertThat_when_input_test_data(input, expect);
    }

    @Test
    public void app_run_case_10() throws Exception {
        libraryController.setCurrentStatus(Status.librarian_main_menu);
        String input = "1";
        String expect = "Welcome to Biblioteca:\n" +
                "1.list books\n" +
                "2.list movies\n" +
                "q.Quit\n" +
                "Please enter your choose(1~2/q):";
        this.should_return_assertThat_when_input_test_data(input, expect);
    }

    @Test
    public void app_run_case_11() throws Exception {
        libraryController.setCurrentStatus(Status.librarian_main_menu);
        String input = "6";
        String expect = "Welcome to Biblioteca:\n" +
                "1.list books\n" +
                "2.list movies\n" +
                "q.Quit\n" +
                "Please enter your choose(1~2/q):";
        this.should_return_assertThat_when_input_test_data(input, expect);
    }

    @Test
    public void app_run_case_12() throws Exception {
        libraryController.setCurrentStatus(Status.librarian_choose);
        String input = "6";
        String expect = "The input is incorrect. Please enter it again";
        this.should_return_assertThat_when_input_test_data(input, expect);
    }

    @Test
    public void app_run_case_13() throws Exception {
        libraryController.setCurrentStatus(Status.librarian_choose);
        String input = "1";
        String expect = "1.\n" +
                "  书名: 代码整洁之道\n" +
                "  作者: martin\n" +
                "  出版日期: 2017-9-15\n" +
                "2.\n  书名: 重构到模式\n" +
                "  作者: martin\n" +
                "  出版日期: 2017-9-15\n" +
                "3.\n" +
                "  书名: 程序员的思维修养\n" +
                "  作者: martin\n" +
                "  出版日期: 2017-9-15\n" +
                "Please enter any value to return to the main menu";
        this.should_return_assertThat_when_input_test_data(input, expect);
    }

    @After
    public void tearDown() throws Exception {
        libraryController.setCurrentStatus(Status.wait_input);
    }

    private void should_return_assertThat_when_input_test_data(String input, String expectedData) throws Exception {
        String actualData = libraryController.biblioteca_book(input);
        assertThat(actualData, is(expectedData));
    }

}
