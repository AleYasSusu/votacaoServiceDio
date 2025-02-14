package com.aledev.votacaoservice.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "pauta")
public class Pauta implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "ID da pauta", example = "1")
    private Long id;

    @NotBlank(message = "pauta-1")
    @Schema(description = "Nome da pauta", example = "Nome da Pauta")
    private String nome;


}
