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

public class ModelTestJuego {
    @Test
    void crearAnime_verDatosCorrector(){
        //Creacion de un anime
        List<ModelAnime> anime = new ArrayList<>();
        ModelAnime anime1 = new ModelAnime();
        anime1.setIdAnime(1);
        anime.add(anime1);

        //creación del anime para verifacar
        ModelJuego juego = new ModelJuego();
       
        juego.setIdJuego(1);
        juego.setNombreJuego("The witcher 3: Wild hunt");
        juego.setDescripcionJuego("Geralt de Rivia se ve enfrentado a su pasado tras recuperar la memoria, junto con la inesperada aparición de su hija adoptiva");
        juego.setGenero1Juego("drama");
        juego.setGenero2Juego("acción");
        juego.setGenero3Juego("fantasía");
        juego.setClasificacionEdadJuego("+18");
        juego.setListAnime(anime);

        // Verificando que se asigaron
        assertEquals(1, juego.getIdJuego());
        assertEquals("The witcher 3: Wild hunt", juego.getNombreJuego());
        assertEquals("Geralt de Rivia se ve enfrentado a su pasado tras recuperar la memoria, junto con la inesperada aparición de su hija adoptiva", juego.getDescripcionJuego());
        assertEquals("drama", juego.getGenero1Juego());
        assertEquals("acción", juego.getGenero2Juego());
        assertEquals("fantasía", juego.getGenero3Juego());
        assertEquals("+18", juego.getClasificacionEdadJuego());

        assertNotNull(juego);
    }
}
    

