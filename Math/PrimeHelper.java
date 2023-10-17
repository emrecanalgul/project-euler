package Math;

public class PrimeHelper {

    public static long getNextPrime(long lastPrime) {
        for (var i = lastPrime + 1; i < Long.MAX_VALUE; i++)
        {
            if (isPrimeNumber(i)) return i;
        }

        return  -1;
    }

    public static boolean isPrimeNumber(long n)
    {
        if (n == 2) return true;

        if (n <= 1 || n % 2 == 0) return false;

        int counter = 3;
        while (Math.pow(counter, 2) <= n)
        {
            if (n % counter == 0)
                return false;
            else
                counter += 2;
        }

        return true;
    }
}
