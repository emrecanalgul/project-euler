package ProjectEuler;

import base.IProjectEuler;
import base.Print;

public class PE001 extends Print implements IProjectEuler {

    @Override
    public void run() {

        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0)
                sum += i;
        }

        Println(sum);
    }
}
