import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author huisheng.jin
 * @date 2020/1/17.
 */
public class FibonacciTest {
//    @Test
//    void demo() {
//       assertThat(Fibonacci.of(2)).isEqualTo(1);
//    }

    @ParameterizedTest
    @CsvSource({
            "0,0",
            "1,1",
            "2,1",
            "3,2",
            "4,3",
            "5,5",
            "6,8",
            "8,21",
    })
    void should_return_right_when_input_number(Integer number, Long expected) {
        assertThat(Fibonacci.of(number)).isEqualTo(expected);
    }

    @Test
    void should_return_right_when_input_50() {
        assertThat(Fibonacci.of(50)).isEqualTo(12586269025l);
    }

    public static void main(String[] args) {
        IntStream.range(1, 51).forEach(number -> System.out.println(Fibonacci.of(number)));
    }
}
