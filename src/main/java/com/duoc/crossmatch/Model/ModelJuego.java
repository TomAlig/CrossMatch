package com.duoc.crossmatch.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Juegos")
public class ModelJuego {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idJuego;

    @NotBlank
    private String nombreJuego;

    private String descripcionJuego;

    @NotBlank
    private String genero1Juego;

    @NotBlank
    private String genero2Juego;

    @NotBlank
    private String genero3Juego;

    @NotBlank
    private String clasificacionEdadJuego;
}