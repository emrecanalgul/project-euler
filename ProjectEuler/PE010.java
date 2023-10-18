package ProjectEuler;

import base.IProjectEuler;
import base.Print;
import Math.PrimeHelpers;

public class PE010 extends Print implements IProjectEuler {
    @Override
    public void run() {

        int number = 2000000;
        long summartionPrimes = 0;
        for (int i = 2; i < number; i++)
        {
            if (PrimeHelpers.isPrimeNumber(i))
                summartionPrimes += i;
        }

        Println(summartionPrimes);
    }
}
