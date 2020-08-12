package com.Maike.FilaDeEspera.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fila")
public class ControladorDeFila {
    @GetMapping
    public String get(){
        return "Seja Bem-Vindo!";
    }
}
