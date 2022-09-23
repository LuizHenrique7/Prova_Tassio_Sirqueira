package br.edu.universidadedevassouras.prova.controller;

import br.edu.universidadedevassouras.prova.model.Telefone;
import br.edu.universidadedevassouras.prova.repository.TelefoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

public class TelefoneController {


    @Autowired
    private TelefoneRepository _telefoneRepository;
    private Telefone telefone;

    @GetMapping
    public @ResponseBody Iterable<Telefone> getAll(){
        return _telefoneRepository.findAll();
    }

    @GetMapping(path = "/telefone/{id}")
    public @ResponseBody Optional<Telefone> getTelefone(@PathVariable("id")Long id){
        return _telefoneRepository.findById(id);
    }

    @PostMapping
    public Telefone postTelefone(@RequestBody Telefone p){
        return _telefoneRepository.save(p);
    }

    @DeleteMapping
    public void Delete(){
        _telefoneRepository.deleteAll();
    }

    @PutMapping
    public Telefone putTelefone(@RequestBody Telefone p){

        return _telefoneRepository.save(p);
    }


}

