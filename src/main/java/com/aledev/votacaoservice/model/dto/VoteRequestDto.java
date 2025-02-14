package com.aledev.votacaoservice.model.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class VoteRequestDto {
    private Long sessionId;
    private String cpf;
    private String escolha;

}
