package com.learning.ravinder.controller;

import com.learning.ravinder.service.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owner")
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping("/index")
    public String listOwners(Model owners){

        owners.addAttribute("ownerList", ownerService.findAll());
        return "owners/index";
    }

}
