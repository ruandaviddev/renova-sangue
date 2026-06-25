package com.web.ufc.renova_sangue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TelaRequisitosController {

    @GetMapping("/telarequisitos")
    public String teste() {

        return "TelaRequisitos";
    }
}