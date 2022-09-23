package br.edu.universidadedevassouras.prova.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Endereco{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true)
    private String CEP;

    @Column(nullable = false)
    private String Tipo_Logradouro;

    @Column(nullable = false)
    private String Logradouro;

    @Column(nullable = false, unique = true)
    private int Numero;

    @Column(nullable = false)
    private String Bairro;

    @Column(nullable = false)
    private String Cidade;

    @Column(nullable = false)
    private String Estado;

    @Column(nullable = false)
    private String Pais;


}
