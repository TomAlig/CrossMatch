package com.duoc.crossmatch.model;

import com.duoc.crossmatch.Model.ModelAnime;
import com.duoc.crossmatch.Model.ModelJuego;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class ModelTestAnime {
   
    @Test
    void crearAnime_verDatosCorrector(){
        //Creacion de un juego
        List<ModelJuego> juego = new ArrayList<>();
        ModelJuego juego1 = new ModelJuego();
        juego1.setIdJuego(1);
        juego.add(juego1);

        //creación del anime para verifacar
        ModelAnime anime = new ModelAnime();
       
        anime.setIdAnime(1);
        anime.setNombreAnime("bnha");
        anime.setDescripcionAnime("ss");
        anime.setGenero1Anime("acción");
        anime.setGenero2Anime("shounen");
        anime.setGenero3Anime("fantasía");
        anime.setClasificacionEdadAnime("+14");
        anime.setListJuego(juego);

        // Verificando que se asigaron
        assertEquals(1, anime.getIdAnime());
        assertEquals("bnha", anime.getNombreAnime());
        assertEquals("ss", anime.getDescripcionAnime());
        assertEquals("acción", anime.getGenero1Anime());
        assertEquals("shounen", anime.getGenero2Anime());
        assertEquals("fantasía", anime.getGenero3Anime());
        assertEquals("+14", anime.getClasificacionEdadAnime());

        assertNotNull(anime);
    }
}
