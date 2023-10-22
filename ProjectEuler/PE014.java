package ProjectEuler;

import base.IProjectEuler;
import base.Print;

import java.math.BigInteger;

public class PE014 extends Print implements IProjectEuler {

    private  final  static int NUMBER = 1000000;
    @Override
    public void run() {

        long maxCount = 0;
        long maxStartingNumber = 0;
        long sequenceNumber;

        for (int i = 2; i <= NUMBER; i++)
        {
            int count = 1;
            sequenceNumber = i;
            while (sequenceNumber != 1)
            {
                if (sequenceNumber % 2 == 0)
                    sequenceNumber = sequenceNumber / 2;
                else
                    sequenceNumber = 3 * sequenceNumber + 1;

                count++;
            }

            if (count > maxCount)
            {
                maxCount = count;
                maxStartingNumber = i;
            }
        }

        Println(maxStartingNumber);
    }

}
