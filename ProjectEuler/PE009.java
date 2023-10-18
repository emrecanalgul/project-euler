package ProjectEuler;

import base.IProjectEuler;
import base.Print;

public class PE009 extends Print implements IProjectEuler {
    @Override
    public void run() {

        int productSum = 0;
        int number = 1000;
        boolean isBreak = false;

        for (var a = 1; a < number ; a++)
        {
            for (var b = a; b < number ; b++)
            {
                int c = number - a - b;
                int aPow = a * a;
                int bPow = b * b;
                int cPow = c * c;

                if (aPow + bPow == cPow)
                {
                    isBreak = true;
                    productSum = a * b * c;
                    break;
                }
            }

            if (isBreak) break;
        }



        Println(productSum);
    }
}
