package com.sunkenship.exerciciossb.controllers;

import com.sunkenship.exerciciossb.models.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {

    @GetMapping("/qualquer") //qndo é apenas URL o path = não é necessário
    public Cliente obterCliente() {
        return new Cliente(28, "Pedro", "123.456.789-00");
    }

    @GetMapping("/{id}") // acessa com cliente/id
    public Cliente obterClientePorID1(@PathVariable int id){
        return new Cliente(id, "Maria", "987.654.321-00");
    }

    @GetMapping //acessa com clientes?id=
    public Cliente obterClientePorID2(@RequestParam(name = "id", defaultValue = "1") int id){
        return new Cliente(id, "Maria", "987.654.321-00");
    }
}
