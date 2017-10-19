package org.postgetman.schedule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DateTest {

    private static Logger logger = LoggerFactory.getLogger(DateTest.class);

    public static void main(String[] args) {
        for(int i = 0;i<6;i++){
            if(i%2==0){
                logger.info("i {}",i);
            }else{
                logger.error("kek ne 0");
            }
        }
    }
}
