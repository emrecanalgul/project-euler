package ProjectEuler;

import base.IProjectEuler;
import base.Print;

public class PE002 extends Print implements IProjectEuler {
    @Override
    public void run() {
        int fibLimit = 4000000;
        int firstFib = 0;
        int secondFib = 1;
        int sumEvenValFib = 0;

        while (secondFib < fibLimit) {
            int tempSecondFib = secondFib;
            secondFib += firstFib;
            firstFib = tempSecondFib;
            if (secondFib % 2 == 0)
                sumEvenValFib += secondFib;
        }

        Println(sumEvenValFib);
    }
}
