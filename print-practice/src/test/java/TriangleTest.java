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
    public void asteriskLine_test() {
        assertThat(triangle.asteriskLine(1), is("*"));
    }

    @Test
    public void asteriskVertical_test() {
        assertThat(triangle.asteriskVertical(1), is("*\n"));
    }

    @Test
    public void rightTriangle_test() {
        assertThat(triangle.rightTriangle(1), is("*\n"));
    }
}
