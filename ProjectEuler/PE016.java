package ProjectEuler;

import base.IProjectEuler;
import base.Print;

import java.math.BigInteger;

public class PE016 extends Print implements IProjectEuler {

    private final static int BASE = 2;
    private final static int EXPONENT = 1000;

    @Override
    public void run() {

        int sumResult = 0;
        String numberTmp =  BigInteger.valueOf(BASE).pow(EXPONENT).toString();

        for (int i = 0; i < numberTmp.length(); i++)
            sumResult +=  Character.getNumericValue(numberTmp.charAt(i));

        Println(sumResult);

    }

}
