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

    public static BigInteger factorial(int number) {
        BigInteger fact = new BigInteger("1");
        for (var i = number; i > 0; i--)
            fact = fact.multiply(new BigInteger(String.valueOf(i)));

        return fact;
    }

    public static long sumOfNumbers(BigInteger numbers) {
        long sum = 0;
        while (numbers.intValue() > 0) {
            sum += numbers.intValue() % 10;
            numbers = numbers.divide(new BigInteger("10"));
        }

        return sum;
    }

    public static int divisorSum(int number) {
        int sum = 1;
        int i = 2;
        while (i < Math.ceil(Math.sqrt(number)))
        {
            if (number % i == 0)
            {
                sum += i;
                sum += number / i;
            }

            i++;
            if (i * i == number)
                sum += i;
        }

        return sum;
    }
}
