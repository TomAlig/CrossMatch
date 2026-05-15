package com.duoc.crossmatch.Dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class NomClasJuegoDTO {

    @NotBlank
    private String nombreJuego;

    @NotBlank
    private String clasificacionEdadJuego;
}