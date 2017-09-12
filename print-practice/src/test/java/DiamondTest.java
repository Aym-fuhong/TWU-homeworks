import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DiamondTest {
private Diamond diamond = new Diamond();
    @Test
    public void testPrintAsterisk() {
        assertThat(diamond.centered_triangle(1), is("*\n"));
    }
}
