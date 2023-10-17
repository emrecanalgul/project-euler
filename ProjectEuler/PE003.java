package ProjectEuler;

import base.IProjectEuler;
import base.Print;
import Math.PrimeHelpers;

public class PE003 extends Print implements IProjectEuler {
    @Override
    public void run() {

        long number = 600851475143L;
        long lastPrime = 1;
        long largestPrimeNumber = 0;

        while (lastPrime <= Math.sqrt(number))
        {
            if (number % lastPrime == 0 && lastPrime > largestPrimeNumber) largestPrimeNumber = lastPrime;


            lastPrime = PrimeHelpers.getNextPrime(lastPrime);
        }

        Println(largestPrimeNumber);
    }
}
