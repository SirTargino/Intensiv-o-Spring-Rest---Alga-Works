package com.algaworks.awpag.awpagapi.domain.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
//@Table(name = "tb_cliente"), se quisesse usar nomes diferentes

@EqualsAndHashCode(onlyExplicitlyIncluded = true) //Considera igual somente as que eu explicitar
@Getter
@Setter
public class Cliente {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@Column(name = "nome"), se quisesse usar nomes diferentes
    private String nome;
    private String email;

    @Column(name = "fone")
    private String telefone;


}
