package com.learning.ravinder.controller;

import com.learning.ravinder.service.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/vets", "/vets/index", "vets.html"})
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @GetMapping
    public String listVets(Model vets){
        vets.addAttribute("vetList", vetService.findAll());
        return "vets/index";
    }

}
