package org.postgetman.schedule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalTime;

public class DateTest {

    private static Logger logger = LoggerFactory.getLogger(DateTest.class);

    public static void main(String[] args) {
        LocalTime t1 = LocalTime.of(16,30);
        LocalTime t2 = LocalTime.of(13,30);


        System.out.println(t2);
    }
}
