package com.web.ufc.renova_sangue.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "relato")
public class Relato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_relato")
    private Long id;

    private String nome_autor;
    private String tipo_sanguineo;

    @Column(columnDefinition = "TEXT")
    private String texto_relato;

    private LocalDateTime data_criacao;

    @ManyToOne
    @JoinColumn(name = "hemocentro_id")
    private Hemocentro hemocentro;
}