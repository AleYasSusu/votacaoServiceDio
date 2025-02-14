package com.aledev.votacaoservice.model.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class VotacaoResultadoDto {
    private int yesVotes;
    private int noVotes;
    private String winner;
}
