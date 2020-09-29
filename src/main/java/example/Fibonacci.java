package example;

/**
 * @author huisheng.jin
 * @date 2020/9/29.
 */
public class Fibonacci {
    public static long of(int number) {
        if (number == 0) {
            return 0;
        }
        if (number == 1 || number == 2) {
            return 1;
        }

        return of(number - 1, number - 2);
    }

    private static long of(int first, int second) {
        return of(first) + of(second);
    }
}
