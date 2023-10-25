package ProjectEuler;

import base.IProjectEuler;
import base.Print;

import java.math.BigInteger;

import Math.MathHelpers;

public class PE020 extends Print implements IProjectEuler {

    @Override
    public void run() {

        String temp = MathHelpers.factorial(100).toString();
        int sum = 0;
        for (int i = 0; i < temp.length(); i++)
            sum += temp.charAt(i) - '0';

        Println(sum);
    }

}
