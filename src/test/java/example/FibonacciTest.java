package example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

/**
 * @author huisheng.jin
 * @date 2020/9/29.
 */
public class FibonacciTest {
    @ParameterizedTest
    @CsvSource({
            "0,0",
            "1,1",
            "2,1",
            "3,2",
            "50,12586269025",
    })
    public void assertFibonacci(int number, long expected) {
        assertThat(Fibonacci.of(number)).isEqualTo(expected);
    }


}
