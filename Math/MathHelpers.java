package Math;

public class MathHelpers {

    public static long productOfNumbersInSeries(long n)
    {
        long product = 1;
        while (n != 0)
        {
            product = product * (n % 10);
            n = n / 10;
        }
        return product;
    }
}
