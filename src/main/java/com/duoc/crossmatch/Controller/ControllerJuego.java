package com.duoc.crossmatch.Controller;

import com.duoc.crossmatch.Model.ModelJuego;
import com.duoc.crossmatch.Service.ServiceJuego;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/juegos")
public class ControllerJuego {
    @Autowired
    private ServiceJuego serviceJuego;

    @GetMapping
    public ResponseEntity<List<ModelJuego>> listarJuegos() {
        System.out.println("[ControllerJuego] -> listarJuego");
        return ResponseEntity.ok(serviceJuego.getJuego());
    }

    @PostMapping
    public ResponseEntity<ModelJuego> agregarJuego(@Valid @RequestBody ModelJuego juego) {
        System.out.println("[ControllerJuego] -> agregarJuego");
        return ResponseEntity.status(HttpStatus.CREATED).body(serviceJuego.saveJuego(juego));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ModelJuego> buscarAnime(@PathVariable int id) {
        System.out.println("[ControllerJuego] -> buscarJuego id=" + id);
        ModelJuego juego = serviceJuego.getJuegoId(id);
        if (juego == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(juego);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ModelJuego> actualizarJuego(@PathVariable int id, @Valid @RequestBody ModelJuego juego) {
        System.out.println("[ControllerJuego] -> actualizarJuego id=" + id);
        juego.setIdJuego(id);
        ModelJuego actualizado = serviceJuego.updateModelJuego(juego);
        if (actualizado == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(actualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarJuego(@PathVariable int id) {
        System.out.println("[ControllerJuego] -> eliminarJuego id=" + id);
        serviceJuego.deleteJuego(id);
        return ResponseEntity.noContent().build();
    }

}
