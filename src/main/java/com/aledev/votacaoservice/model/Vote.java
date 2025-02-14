package com.aledev.votacaoservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
@Table(name = "vote")
public class Vote implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "ID do voto", example = "1")
    private Long id;

    @NotBlank(message = "voto-1")
    @Schema(description = "CPF do votante", example = "12345678900")
    private String cpf;

    @NotNull(message = "voto-2")
    @Schema(description = "Escolha do votante ('Sim' ou 'Não')", example = "Sim")
    private String escolha;

    @NotNull(message = "voto-3")
    @ManyToOne(fetch = FetchType.EAGER)
    @Schema(description = "Sessão em que o voto foi registrado")
    private Session session;

    @JsonIgnore
    public boolean isNew() {
        return getId() == null;
    }

    @JsonIgnore
    public boolean alreadyExist() {
        return getId() != null;
    }


}