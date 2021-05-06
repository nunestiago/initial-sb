package com.sunkenship.exerciciossb.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    @GetMapping("/somar/{a}/{b}") // calc que funciona por path ex: calculadora/soma/5/4 -9-
    public int somar(@PathVariable int a,@PathVariable int b){
        return a + b;
    }

    @GetMapping("/subtrair") //calculadora que funcione por parâmetro ex: calculadora/subtrair?a=20&b=10 -10-
    public int subtrair(@RequestParam(name = "a") int a,@RequestParam(name="b") int b){
        return a - b;
    }
}
