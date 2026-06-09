package com.duoc.crossmatch.controller;

import com.duoc.crossmatch.Model.ModelAnime;
import com.duoc.crossmatch.Model.ModelJuego;
import com.duoc.crossmatch.Controller.ControllerJuego;
import com.duoc.crossmatch.Service.ServiceJuego;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)

class ControllerTestJuego {

    @Mock
    private ServiceJuego juegoService;

    @InjectMocks
    private ControllerJuego juegoController;

    @Test
    void crearJuego_retorna201_preguntarNombre() {
        List<ModelAnime> anime = new ArrayList<>(null);
        ModelJuego juego = new ModelJuego(1, "Minecraft", "aaa","Acción", "Aventura", "Fantasía", "+10", anime);

        when(juegoService.saveJuego(juego)).thenReturn(juego);

        // Llamamos al método del controlador que queremos probar.
        // El resultado es un ResponseEntity<Libro> con estado HTTP y cuerpo.
        var respuesta = juegoController.agregarJuego(juego);

        // Para que el test sea completo, verificamos varios aspectos de la respuesta:

        // 1) La respuesta no debe ser nula.
        assertNotNull(respuesta);

        // 2) El estado HTTP esperado al crear un recurso es 201 (CREATED).
        assertEquals(HttpStatus.CREATED, respuesta.getStatusCode());

        // 3) El cuerpo de la respuesta debe existir.
        var body = respuesta.getBody();
        assertNotNull(body);

        // 4) Validamos un dato clave del cuerpo para confirmar que se devolvió el libro correcto.
        assertEquals("Minecraft", body.getNombreJuego());

    }
}