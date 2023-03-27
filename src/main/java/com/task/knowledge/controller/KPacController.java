package com.task.knowledge.controller;

import com.task.knowledge.DAO.KPacDAO;
import com.task.knowledge.DAO.KPacSetDAO;
import com.task.knowledge.model.DTO.ListKPacsForSetDTOObject;
import com.task.knowledge.model.KPac;
import com.task.knowledge.model.KPacSet;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class KPacController {
    @Autowired
    private KPacDAO kPacDAO;
    @Autowired
    private KPacSetDAO kPacSetDAO;


    @RequestMapping(value = "/kpacs")
    public ModelAndView listKPacs(ModelAndView model) {
        System.out.println("kpacs was called");
        List<KPac> kPacs = kPacDAO.kpacsAll();
        System.out.println(kPacs);
        model.addObject("kpacs", new JSONArray(kPacs));
        model.setViewName("kpacs");
        return model;
    }

    @DeleteMapping(value = "/kpac")
    public ResponseEntity deleteKPac(@RequestParam String kpacId) {
        System.out.println("Deleting kpac ID: " + kpacId);
        if (kPacDAO.deleteKPac(Long.parseLong(kpacId)))
            return ResponseEntity.status(204).build();
        else
            return ResponseEntity.status(205).build();
    }

    @DeleteMapping(value = "/set")
    public ResponseEntity deleteKPacSet(@RequestParam String setId) {
        System.out.println("Deleting set ID: " + setId);
        if (kPacSetDAO.deleteSet(Long.parseLong(setId)))
            return ResponseEntity.status(204).build();
        else
            return ResponseEntity.status(205).build();
    }

    @RequestMapping(value = "/sets")
    public ModelAndView listSets(ModelAndView model) {
        List<KPacSet> sets = kPacSetDAO.setsAll();
        model.addObject("sets", new JSONArray(sets));
        model.setViewName("sets");
        return model;
    }

    @RequestMapping(value = "/set/{id}")
    public ModelAndView listKPacsBySetId(ModelAndView model, @PathVariable String id) {
        System.out.println("kpacs by  was called");
        ListKPacsForSetDTOObject kPacs = kPacDAO.kpacsBySetId(Long.parseLong(id));
        model.addObject("kpacs", new JSONArray(kPacs.getkPacs()));
        model.addObject("setId", kPacs.getkPacSet().getSetId());
        model.addObject("setTitle", kPacs.getkPacSet().getTitle());
        model.setViewName("kpacs");
        return model;
    }


}
