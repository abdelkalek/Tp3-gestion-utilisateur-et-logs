package com.example.demo.groupe;

import com.example.demo.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupeService {
    @Autowired
    public GroupeRepository groupeRepository;
    public Groupe add(Groupe groupe) {
        return groupeRepository.save(groupe);
    }
    public List<Groupe> getGroupeList() {
        return (List<Groupe>) groupeRepository.findAll();
    }
}

