package ProjectEuler;

import base.IProjectEuler;
import base.Print;
import Math.PrimeHelper;

public class PE003 extends Print implements IProjectEuler {
    @Override
    public void Run() {

        long number = 600851475143L;
        long lastPrime = 1;
        long largestPrimeNumber = 0;

        while (lastPrime <= Math.sqrt(number))
        {
            if (number % lastPrime == 0 && lastPrime > largestPrimeNumber) largestPrimeNumber = lastPrime;


            lastPrime = PrimeHelper.getNextPrime(lastPrime);
        }

        Println(largestPrimeNumber);
    }
}
