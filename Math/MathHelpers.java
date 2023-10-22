package Math;

import java.math.BigInteger;

public class MathHelpers {

    public static long productOfNumbersInSeries(long n) {
        long product = 1;
        while (n != 0) {
            product = product * (n % 10);
            n = n / 10;
        }
        return product;
    }

    public static BigInteger Factorial(int number) {
        BigInteger fact = new BigInteger("1");
        for (var i = number; i > 0; i--)
            fact = fact.multiply(new BigInteger(String.valueOf(i)));

        return fact;
    }
}
