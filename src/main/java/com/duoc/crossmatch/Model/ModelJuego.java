package com.duoc.crossmatch.Model;

import java.util.List;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "juegos")

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

    @ManyToMany()
    private List<ModelAnime> listAnime;
}