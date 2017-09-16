import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorTest {

    private Factor factor = new Factor();

    @Test
    public void generate_test() {
        assertThat(factor.generate(30), is("[2, 3, 5]"));
    }
}
