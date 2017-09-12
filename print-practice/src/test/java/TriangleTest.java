import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TriangleTest {
    private Triangle triangle = new Triangle();

    @Test
    public void testPrintAsterisk() {
        assertThat(triangle.printAsterisk(), is("*"));
    }

    @Test
    public void testAsteriskLine() {
        assertThat(triangle.asteriskLine(1), is("*"));
    }

    @Test
    public void testAsteriskVertical() {
        assertThat(triangle.asteriskVertical(1), is("*\n"));
    }

    @Test
    public void testRightTriangle() {
        assertThat(triangle.rightTriangle(1), is("*\n"));
    }
}
