package com.task.knowledge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class KPacController {
    @RequestMapping(value="/")
    public ModelAndView listContact(ModelAndView model){
//        List<Contact> listContact = contactDAO.list();
//        model.addObject("listContact", listContact);
        model.setViewName("home");
        return model;
    }

    @RequestMapping(value="/kpacs")
    public ModelAndView listKPacs(ModelAndView model){
//        List<Contact> listContact = contactDAO.list();
//        model.addObject("listContact", listContact);
        model.setViewName("kpacs");
        return model;
    }
}
