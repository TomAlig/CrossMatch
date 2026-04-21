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
import com.duoc.crossmatch.modeljuego; 
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Animes")
public class ModelAnime {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAnime;

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

    @ManyToMany(mappedBy = "juego")
    private ModelJuego listJuego;
}