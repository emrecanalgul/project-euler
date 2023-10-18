package ProjectEuler;

import base.IProjectEuler;
import base.Print;

public class PE006 extends Print implements IProjectEuler {
    @Override
    public void run() {

        int sumSquare = 0;
        int squareSum = 0;
        for (int i = 1; i <= 100; i++) {
            sumSquare += i;
            squareSum += i * i;
        }
        Println(sumSquare * sumSquare - squareSum);
    }
}
