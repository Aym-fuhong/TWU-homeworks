import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DiamondTest {
    private Diamond diamond = new Diamond();

    @Test
    public void center_triangle_test_case_one() {
        assertThat(diamond.centered_triangle(1), is("*\n"));
    }

    @Test
    public void center_triangle_test_case_two() {
        assertThat(diamond.centered_triangle(2), is(" *\n***\n"));
    }

    @Test
    public void center_triangle_test_case_three() {
        assertThat(diamond.centered_triangle(3), is("  *\n ***\n*****\n"));
    }

    @Test
    public void inverted_triangle_test_case_one() {
        assertThat(diamond.inverted_triangle(1), is(""));
    }

    @Test
    public void inverted_triangle_test_case_two() {
        assertThat(diamond.inverted_triangle(2), is(" *\n"));
    }

    @Test
    public void inverted_triangle_test_case_three() {
        assertThat(diamond.inverted_triangle(3), is(" ***\n  *\n"));
    }

    @Test
    public void center_diamond_test_case_one() {
        assertThat(diamond.centered_diamond(1), is("*\n"));
    }

    @Test
    public void center_diamond_test_case_two() {
        assertThat(diamond.centered_diamond(2), is(" *\n***\n *\n"));
    }

    @Test
    public void center_diamond_test_case_three() {
        assertThat(diamond.centered_diamond(3), is("  *\n ***\n*****\n ***\n  *\n"));
    }

    @Test
    public void center_diamond_name_test_case_one() {
        assertThat(diamond.centered_diamond_name(1), is("Aym\n"));
    }

    @Test
    public void center_diamond_name_test_case_two() {
        assertThat(diamond.centered_diamond_name(2), is(" *\nAym\n *\n"));
    }

    @Test
    public void center_diamond_name_test_case_three() {
        assertThat(diamond.centered_diamond_name(3), is("  *\n ***\nAym\n ***\n  *\n"));
    }
}
