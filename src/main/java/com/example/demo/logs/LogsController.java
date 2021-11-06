package com.example.demo.logs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping (path = "logs")
public class LogsController {

    @Autowired
    private LogsService logsService;
    @GetMapping(value = {"/all", "/"})
    public List<Logs> getlistUser() {
        return logsService.getLogsList();
    }

    @PostMapping(value = {"/add"})
    public Logs creatnewUser(@RequestBody Logs logs) {
        return logsService.add(logs);
    }
}
