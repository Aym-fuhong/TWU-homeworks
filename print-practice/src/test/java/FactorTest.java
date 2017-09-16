import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorTest {

    private Factor factor = new Factor();

    @Test
    public void generate_test_case_one() {
        assertThat(factor.generate(30), is("[2, 3, 5]"));
    }

    @Test
    public void generate_test_case_two() {
        assertThat(factor.generate(1), is("[]"));
    }

    @Test
    public void generate_test_case_three() {
        assertThat(factor.generate(10), is("[2, 5]"));
    }
}
