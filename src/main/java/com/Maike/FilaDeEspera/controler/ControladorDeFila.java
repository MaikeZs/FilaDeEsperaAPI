package com.Maike.FilaDeEspera.controler;

import com.Maike.FilaDeEspera.modelo.Pessoa;
import com.Maike.FilaDeEspera.repositorio.PessoaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fila")
public class ControladorDeFila {
 @Autowired
 private PessoaRepositorio rp;
    @GetMapping
    public Iterable<Pessoa>  get(){
        return rp.findAll();
    }

}
