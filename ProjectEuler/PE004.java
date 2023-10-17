package ProjectEuler;

import base.IProjectEuler;
import base.Print;
import Math.PalindromeHelpers;

public class PE004 extends Print implements IProjectEuler {
    @Override
    public void run() {

        int firstNumber = 999;
        int secondNumber = 0;
        long maxProductNumber = 0;

        while (firstNumber > 99)
        {
            secondNumber = firstNumber;
            while (secondNumber > 99)
            {
                long productNumber = firstNumber * secondNumber;
                if (PalindromeHelpers.IsPalindrome(productNumber))
                {
                    if (productNumber > maxProductNumber) maxProductNumber = productNumber;
                }

                secondNumber--;
            }

            firstNumber--;
        }

        Println(maxProductNumber);
    }
}
