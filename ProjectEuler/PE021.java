package ProjectEuler;

import Math.MathHelpers;
import base.IProjectEuler;
import base.Print;

public class PE021 extends Print implements IProjectEuler {

    @Override
    public void run() {

        int amicableNumbersSum = 0;
        int maxNumber = 10000;

        for (int i = 2; i < maxNumber; i++)
        {
            int firstDivisorSum = divisorSum(i);
            if (firstDivisorSum > i && firstDivisorSum <= maxNumber)
            {
                int secondDivisorSum = divisorSum(firstDivisorSum);
                if (secondDivisorSum == i)
                    amicableNumbersSum += firstDivisorSum + i;
            }

        }

        Println(amicableNumbersSum);
    }

    static int divisorSum(int number)
    {
        int divisourSum = 0;

        for (int k = number - 1; k > 0; k--)
        {
            if (number % k == 0) divisourSum += k;
        }

        return divisourSum;
    }

}
