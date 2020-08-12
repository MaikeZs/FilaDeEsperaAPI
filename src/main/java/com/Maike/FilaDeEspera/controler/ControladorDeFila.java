package com.Maike.FilaDeEspera.controler;

import com.Maike.FilaDeEspera.modelo.Pessoa;
import com.Maike.FilaDeEspera.repositorio.PessoaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fila")
public class ControladorDeFila {
 @Autowired
 private PessoaRepositorio rp;
    @GetMapping
    public Iterable<Pessoa>  get(){
        return rp.findAll();
    }
    @PostMapping
    public Pessoa post(@RequestBody Pessoa p){
        rp.save(p);
        return p;
    }
    @GetMapping("/teste")
    public Pessoa getSimples(){
        return new Pessoa(1L,"pessoa teste",30);
    }


}
