package com.example.demo.logs;

import com.example.demo.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogsService {

    @Autowired
    private LogsRepository logsRepository;


    public List<Logs> getLogsList() {
        return  (List<Logs>) logsRepository.findAll();
    }

    public Logs add(Logs logs) {
        return logsRepository.save(logs);
    }
}
