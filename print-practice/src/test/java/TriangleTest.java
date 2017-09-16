import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TriangleTest {
    private Triangle triangle = new Triangle();

    @Test
    public void printAsterisk_test() {
        assertThat(triangle.printAsterisk(), is("*"));
    }

    @Test
    public void asteriskLine_test_case_one() {
        assertThat(triangle.asteriskLine(-1), is(""));
    }

    @Test
    public void asteriskLine_test_case_two() {
        assertThat(triangle.asteriskLine(3), is("***"));
    }

    @Test
    public void asteriskVertical_test_case_one() {
        assertThat(triangle.asteriskVertical(1), is("*\n"));
    }

   @Test
    public void asteriskVertical_test_case_two() {
        assertThat(triangle.asteriskVertical(2), is("*\n*\n"));
    }

    @Test
    public void rightTriangle_test_case_one() {
        assertThat(triangle.rightTriangle(1), is("*\n"));
    }

    @Test
    public void rightTriangle_test_case_two() {
        assertThat(triangle.rightTriangle(2), is("*\n**\n"));
    }
}
