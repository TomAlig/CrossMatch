package com.duoc.crossmatch.Model;

import java.util.List;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "animes")

public class ModelAnime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAnime;

    @NotBlank
    private String nombreAnime;

    private String descripcionAnime;

    @NotBlank
    private String genero1Anime;

    @NotBlank
    private String genero2Anime;

    @NotBlank
    private String genero3Anime;

    @NotBlank
    private String clasificacionEdadAnime;

    @ManyToMany()
    private List<ModelJuego> listJuego;
}