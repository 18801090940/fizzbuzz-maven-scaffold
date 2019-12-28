import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class FizzBuzzTest {
    @Test
    public void should_return_value_of_number(){
        assertThat(FizzBuzz.of(1)).isEqualTo("1");
    }

    @Test
    public void should_return_Fizz_given_number_divided_by_three(){
        assertThat(FizzBuzz.of(3)).isEqualTo("Fizz");
    }

    @Test
    public void should_return_Buzz_given_number_divided_by_five(){
        assertThat(FizzBuzz.of(5)).isEqualTo("Buzz");
    }

    @Test
    public void should_return_FizzBuzz_given_number_divided_by_three_and_five(){
        assertThat(FizzBuzz.of(15)).isEqualTo("FizzBuzz");
    }
}
