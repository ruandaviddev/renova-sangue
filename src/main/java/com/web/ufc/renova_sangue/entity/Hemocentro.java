package com.web.ufc.renova_sangue.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "hemocentro")
public class Hemocentro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_hemocentro")
    private Long id;
    private String nome;

    @OneToOne
    @JoinColumn(name = "endereco_id")
    private Endereco endereco_id;

    private String regiao;
    private String telefone;
    private String email;
    private String site;
    private String horario_funcionamento;
    private String outros_canais;

}
