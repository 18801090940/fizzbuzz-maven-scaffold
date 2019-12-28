import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class FizzBuzzTest {
    @Test
    public void test_all_case()
    {
        assert_result(1, "1");
        assert_result(3, "Fizz");
        assert_result(5, "Buzz");
        assert_result(15, "FizzBuzz");
    }
    public void assert_result(int number, String result)
    {
        assertThat(FizzBuzz.of(number)).isEqualTo(result);
    }
}
