package ProjectEuler;

import base.IProjectEuler;
import base.Print;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class PE019 extends Print implements IProjectEuler {

    @Override
    public void run() {

        LocalDate startDate = LocalDate.of(1901, 1,1) ;
        LocalDate endDate =  LocalDate.of(2000, 12, 31);


        int sundayCount = 0;
        while (startDate.isBefore(endDate))
        {
            if (startDate.getDayOfWeek() == DayOfWeek.SUNDAY) sundayCount++;

            startDate = startDate.plusMonths(1);
        }

        Println(sundayCount);
    }

}
