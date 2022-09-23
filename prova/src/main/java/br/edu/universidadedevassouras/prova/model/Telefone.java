package br.edu.universidadedevassouras.prova.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Telefone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true)
    private String Celular;

    @Column(nullable = false, unique = true)
    private String Fixo;
}


