package Math;

public class PalindromeHelpers {

    public static boolean IsPalindrome(long number)
    {
        long tempNumber = number;
        long reverseNumber = 0;
        while (tempNumber > 0)
        {
            reverseNumber = (reverseNumber * 10) + (tempNumber % 10);
            tempNumber /= 10;
        }

        return reverseNumber == number;
    }
}
