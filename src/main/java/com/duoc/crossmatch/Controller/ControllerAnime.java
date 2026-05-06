package com.duoc.crossmatch.Controller;

import com.duoc.crossmatch.Model.ModelAnime;
import com.duoc.crossmatch.Service.ServiceAnime;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/animes")
public class ControllerAnime {
    
    @Autowired
    private ServiceAnime serviceAnime;

    @GetMapping
    public ResponseEntity<List<ModelAnime>> listarAnimes() {
        System.out.println("[ControllerAnime] -> listarAnimes");
        return ResponseEntity.ok(serviceAnime.getAnimes());
    }

    @PostMapping
    public ResponseEntity<ModelAnime> agregarAnime(@Valid @RequestBody ModelAnime anime) {
        System.out.println("[ControllerAnimes] -> agregarAnimes");
        return ResponseEntity.status(HttpStatus.CREATED).body(serviceAnime.saveAnime(anime));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ModelAnime> buscarAnime(@PathVariable int id) {
        System.out.println("[ControllerAnime] -> buscarAnime id=" + id);
        ModelAnime anime = serviceAnime.getAnimeId(id);
        if (anime == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(anime);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ModelAnime> actualizarAnime(@PathVariable int id, @Valid @RequestBody ModelAnime anime) {
        System.out.println("[ControllerAnime] -> actualizarAnime id=" + id);
        anime.setIdAnime(id);
        ModelAnime actualizado = serviceAnime.updateAnime(anime);
        if (actualizado == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(actualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarAnime(@PathVariable int id) {
        System.out.println("[ControllerAnime] -> eliminarAnime id=" + id);
        serviceAnime.deleteAnime(id);
        return ResponseEntity.noContent().build();
    }

}
