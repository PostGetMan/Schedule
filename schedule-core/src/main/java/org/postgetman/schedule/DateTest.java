package org.postgetman.schedule;

import java.time.LocalDate;

public class DateTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1997,8,6);
        System.out.println(date);

        LocalDate date1 = LocalDate.parse("1997-08-06");
        System.out.println(date1);

        System.out.println(date.equals(date1));


    }
}
