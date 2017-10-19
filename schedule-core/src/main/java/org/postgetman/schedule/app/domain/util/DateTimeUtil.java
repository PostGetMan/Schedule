package org.postgetman.schedule.app.domain.util;

public class DateTimeUtil {

    public static int getYear(final String date){
        return Integer.parseInt(date.substring(0,4));
    }

    public static int getMonth(final String date){
        return Integer.parseInt(date.substring(5,7));
    }

    public static int getDay(final String date){
        return Integer.parseInt(date.substring(8,10));
    }
}
