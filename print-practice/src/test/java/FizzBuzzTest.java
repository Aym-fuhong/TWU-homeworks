import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void fizzBuzz_test_case_one() {
        assertThat(fizzBuzz.FizzBuzz(6), is("1\n2\nFizz\n4\nBuzz\nFizz\n"));
    }

    @Test
    public void fizzBuzz_test_two() {
        assertThat(fizzBuzz.FizzBuzz(15), is("1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\n" +
                "Fizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz\n"));
    }
}
