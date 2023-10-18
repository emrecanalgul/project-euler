package ProjectEuler;

import base.IProjectEuler;
import base.Print;
import Math.PrimeHelpers;

public class PE007 extends Print implements IProjectEuler {
    @Override
    public void run() {

        int maxNumber = 10001;
        int numberOfPrime = 1;
        int prime = 1;

        while (numberOfPrime <= maxNumber)
        {
            prime += 1;
            if (PrimeHelpers.isPrimeNumber(prime))
                numberOfPrime += 1;
        }

        Println(prime);
    }
}
