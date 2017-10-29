package org.postgetman.schedule.app.controller;

import org.postgetman.schedule.app.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/records")
public class RecordController {

    @Autowired
    private RecordService service;


}
