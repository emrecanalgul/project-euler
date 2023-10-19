package ProjectEuler;

import base.IProjectEuler;
import base.Print;

public class PE012 extends Print implements IProjectEuler {


    @Override
    public void run() {

        long triangleNumber = 0;
        long number = 0;

        while (true) {
            number++;
            triangleNumber += number;
            int divisionCount = 0;
            for (var i = 1; i <= Math.sqrt(triangleNumber); i++) {
                if (triangleNumber % i == 0)
                    divisionCount += 2;
            }

            if (divisionCount >= 500)
                break;
        }

        Println(triangleNumber);
    }
}
