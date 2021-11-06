package com.example.demo.groupe;

import com.example.demo.logs.Logs;
import com.example.demo.logs.LogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "groupe")
public class GroupeController {

    @Autowired
    private GroupeService groupeService;
    @GetMapping(value = "/all")
    public List<Groupe> getlistGroupe() {
        return groupeService.getGroupeList();
    }

    @PostMapping(value = {"/add"})
    public Groupe creatnewUser(@RequestBody Groupe groupe) {
        return groupeService.add(groupe);
    }
}
