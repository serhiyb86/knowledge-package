package com.task.knowledge.controller;

import com.task.knowledge.DAO.KPacDAO;
import com.task.knowledge.model.DTO.KPacDTOCreateObject;
import com.task.knowledge.model.KPac;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class KPacRestController {

    @Autowired
    private KPacDAO kPacDAO;
    @PostMapping(value = "/kpac",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public KPac createKPac (@RequestBody KPacDTOCreateObject kPac) {
        System.out.println("Received: " + kPac);
        return kPacDAO.createKPac(kPac);
    }
}
