/**
 * @author huisheng.jin
 * @date 2020/1/17.
 */
public class Fibonacci {
    public static Long of(int number) {
        if (number <= 1) {
            return (long) number;
        }
        return ofInternal(number);
    }

    private static Long ofInternal(int number) {
        long f0 = 0, f1 = 1, result = 0;
        for (int i = 2; i <= number; i++) {
            result = f0 + f1;
            f0 = f1;
            f1 = result;
        }
        return result;
    }
}
