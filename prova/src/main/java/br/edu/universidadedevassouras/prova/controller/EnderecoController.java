package br.edu.universidadedevassouras.prova.controller;

import br.edu.universidadedevassouras.prova.model.Endereco;
import br.edu.universidadedevassouras.prova.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

public class EnderecoController{


    @Autowired
    private EnderecoRepository _enderecoRepository;
    private Endereco endereco;

    @GetMapping
    public @ResponseBody Iterable<Endereco> getAll(){
        return _enderecoRepository.findAll();
    }

    @GetMapping(path = "/endereco/{id}")
    public @ResponseBody Optional<Endereco> getEndereco(@PathVariable("id")Long id){
        return _enderecoRepository.findById(id);
    }

    @PostMapping
    public Endereco postEndereco(@RequestBody Endereco p){
        return _enderecoRepository.save(p);
    }

    @DeleteMapping
    public void Delete(){
        _enderecoRepository.deleteAll();
    }

    @PutMapping
    public Endereco putEndereco(@RequestBody Endereco p){

        return _enderecoRepository.save(p);
    }


}
