import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void fizzBuzz_test() {
        assertThat(fizzBuzz.FizzBuzz().isEmpty(), is(false));
    }
}
