package br.edu.universidadedevassouras.prova.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    private String Email;

    @Column(nullable = false)
    private Date Nascimento;

    @Column(nullable = false)
    private char Sexo;

    @Column(nullable = false, unique = true)
    private String CPF;

    @Column(nullable = false, unique = true)
    private String RG;

    @Column(nullable = false)
    private String Tipo_Sanguineo;

    @Column(nullable = false)
    private String Pai;

    @Column(nullable = false)
    private String Mae;

    @Column(nullable = false, unique = true)
    private int Telefone;

    @Column(nullable = false)
    private String Endereco;







}