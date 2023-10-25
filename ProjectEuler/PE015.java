package ProjectEuler;

import base.IProjectEuler;
import base.Print;
import Math.MathHelpers;

import java.math.BigInteger;

public class PE015 extends Print implements IProjectEuler {

    private final static int NUMBER = 1000000;

    @Override
    public void run() {

        BigInteger fact20 = MathHelpers.factorial(20);
        BigInteger fact40 = MathHelpers.factorial(40);

        BigInteger factMultiply = fact20.multiply(fact20);
        BigInteger factDivider = fact40.divide(factMultiply);

        Println(factDivider);
    }

}
