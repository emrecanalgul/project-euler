package ProjectEuler;

import Constants.Constants;
import base.IProjectEuler;
import base.Print;

import java.util.Arrays;

public class PE022 extends Print implements IProjectEuler {

    @Override
    public void run() {
        Arrays.sort(Constants.NAME_LIST);
        int totalNameScore = 0;
        for (var i = 0; i < Constants.NAME_LIST.length; i++) {
            int nameScore = 0;
            for (int j = 0; j < Constants.NAME_LIST[i].length(); j++) {
                nameScore += Arrays.binarySearch(Constants.ALPHABET, Constants.NAME_LIST[i].charAt(j)) + 1;
            }

            totalNameScore += nameScore * (i + 1);
        }

        Println(totalNameScore);
    }
}
