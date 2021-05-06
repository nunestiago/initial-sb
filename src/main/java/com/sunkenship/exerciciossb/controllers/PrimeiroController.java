package com.sunkenship.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {

    @GetMapping(path = {"/ola", "/ola2"}) //mais de uma URL pro mesmo método
    public String ola() {
        return "Olá Spring Boot!";
    }

    @PostMapping (path = {"/ola", "/ola2"}) //o POST precisa de um get com o mesmo path
    public String saudacao() {
        return "Olá Spring Boot! (POST)";
    }
}
