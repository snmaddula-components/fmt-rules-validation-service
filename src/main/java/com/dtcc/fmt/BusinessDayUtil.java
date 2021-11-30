package com.dtcc.fmt;

import static java.util.Calendar.*;

import java.util.Calendar;
import java.util.Date;

public class BusinessDayUtil {

    public static boolean isBusinessDay(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        if
        (
        /* check if weekend */         (cal.get(DAY_OF_WEEK) == SATURDAY || cal.get(DAY_OF_WEEK) == SUNDAY) ||
        /* check if New Year's Day */  (cal.get(MONTH) == JANUARY && cal.get(DAY_OF_MONTH) == 1) ||
        /* check if Christmas */       (cal.get(MONTH) == DECEMBER && cal.get(DAY_OF_MONTH) == 25)
        //TODO:: add additional holidays
        ) {
            return false;
        }
        return true;
    }
}
