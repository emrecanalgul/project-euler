package ProjectEuler;

import Math.PalindromeHelpers;
import base.IProjectEuler;
import base.Print;

public class PE005 extends Print implements IProjectEuler {
    @Override
    public void run() {

        int number = 1;
        while (true)
        {
            boolean isWhileBreak = true;
            for (int i = 1; i <= 20; i++)
            {
                if (number % i != 0)
                {
                    number++;
                    isWhileBreak = false;
                    break;
                }
            }

            if (isWhileBreak) break;
        }

        Println(number);
    }
}
