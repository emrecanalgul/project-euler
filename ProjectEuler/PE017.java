package ProjectEuler;

import base.IProjectEuler;
import base.Print;

import java.math.BigInteger;

public class PE017 extends Print implements IProjectEuler {

    @Override
    public void run() {

        String[] ones = new String[]{"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] unitsTens = new String[]{"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = new String[]{"ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String hundres = "hundred";
        String thousands = "onethousand";
        String and = "and";

        int onesSum = 0;
        for (String one : ones) {
            onesSum += one.length();
        }

        int unitsTensSum = 0;
        for (String unitsTen : unitsTens) {
            unitsTensSum += unitsTen.length();
        }

        int tensSums = 0;
        for (var i = 1; i < tens.length; i++) {
            tensSums += onesSum;
            tensSums += tens[i].length() * 9;
            tensSums += tens[i].length();
        }

        int hundresSum = 0;
        for (var i = 1; i < 10; i++) {
            hundresSum += (ones[i - 1].length() + hundres.length()) * 100;

            hundresSum += and.length() * 99;
            hundresSum += onesSum;
            hundresSum += unitsTensSum;
            hundresSum += tensSums;
        }

        int sumResult = onesSum + unitsTensSum + tensSums + hundresSum + thousands.length();

        Println(sumResult);
    }

}
