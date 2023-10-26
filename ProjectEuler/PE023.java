package ProjectEuler;


import base.IProjectEuler;
import base.Print;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import Math.MathHelpers;

public class PE023 extends Print implements IProjectEuler {

    private  static  final  int LIMIT = 28123;
    @Override
    public void run() {

        int[] sumOfDivisors = new int[LIMIT + 1];
        for (int i = 1; i <= LIMIT; i++) {
            for (int j = 2 * i; j <= LIMIT; j += i) {
                sumOfDivisors[j] += i;
            }
        }

        List<Integer> abundantNumbers = new ArrayList<>();
        for (int i = 12; i <= LIMIT; i++) {
            if (sumOfDivisors[i] > i) {
                abundantNumbers.add(i);
            }
        }

        boolean[] abundantSum = new boolean[LIMIT + 1];
        for (int i = 0; i < abundantNumbers.size(); i++) {
            for (int j = i; j < abundantNumbers.size(); j++) {
                int sum = abundantNumbers.get(i) + abundantNumbers.get(j);
                if (sum <= LIMIT) {
                    abundantSum[sum] = true;
                } else {
                    break;
                }
            }
        }

        int result = 0;
        for (int i = 1; i <= LIMIT; i++) {
            if (!abundantSum[i]) {
                result += i;
            }
        }

        Println(result);
    }
}
