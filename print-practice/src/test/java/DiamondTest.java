import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DiamondTest {
    private Diamond diamond = new Diamond();

    @Test
    public void center_triangle_test() {
        assertThat(diamond.centered_triangle(1), is("*\n"));
    }

    @Test
    public void inverted_triangle_test() {
        assertThat(diamond.inverted_triangle(1), is(""));
    }

    @Test
    public void center_diamond_test() {
        assertThat(diamond.centered_diamond(1), is("*\n"));
    }

    @Test
    public void center_diamond_name_test() {
        assertThat(diamond.centered_diamond_name(1), is("Aym\n"));
    }
}
