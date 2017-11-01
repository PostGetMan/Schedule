package org.postgetman.schedule.app.domain.util;

import org.postgetman.schedule.app.domain.schedule.Record;
import org.postgetman.schedule.app.dto.RecordDTO;

import java.time.LocalDate;
import java.time.LocalTime;

public class ConvertUtil {

    public static Record convertRecord(RecordDTO recordDTO){
        Record record = new Record();
        record.setDate(LocalDate.parse(recordDTO.getDate()));
        record.setTime(LocalTime.parse(recordDTO.getTime()));
        record.setComplaint(recordDTO.getComplaint());

        return record;
    }
}
