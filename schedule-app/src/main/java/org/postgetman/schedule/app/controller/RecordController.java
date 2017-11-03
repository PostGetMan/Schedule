package org.postgetman.schedule.app.controller;

import org.postgetman.schedule.app.domain.schedule.Record;
import org.postgetman.schedule.app.dto.RecordDTO;
import org.postgetman.schedule.app.service.RecordService;
import org.postgetman.schedule.app.util.ConvertUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/records")
public class RecordController extends BaseController{

    @Autowired
    private RecordService service;

    @GetMapping
    public List<Record> findAll(){
        return service.findAll();
    }

    @PostMapping(name = "/add")
    public void addRecord(@RequestBody RecordDTO recordDTO){
        service.addRecord(ConvertUtil.convertRecord(recordDTO));
    }

    @GetMapping("/{date}")
    public List<Record> findAll(@PathVariable(name = "date") final String date){
        return service.findAllByDate(date);
    }


}
