package org.postgetman.schedule.app.controller;

import org.postgetman.schedule.app.domain.schedule.Record;
import org.postgetman.schedule.app.dto.RecordDTO;
import org.postgetman.schedule.app.service.RecordService;
import org.postgetman.schedule.app.service.impl.RecordServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/records")
public class RecordController {

    private RecordService service = new RecordServiceImpl();

    @PostMapping
    public void addRecord(@RequestBody RecordDTO recordDTO){
        service.addrecord(new Record(recordDTO.getDate(),recordDTO.getTime()));
    }
}
