package com.duoc.crossmatch.Service;

import com.duoc.crossmatch.Model.ModelJuego;
import com.duoc.crossmatch.Repository.RepositoryJuego;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceJuego {
    
    @Autowired
    private RepositoryJuego repositoryJuego;

    public List<ModelJuego> getJuego(){
        return repositoryJuego.findAll();
    }

    public ModelJuego saveJuego(ModelJuego juego) {
        return repositoryJuego.save(juego);
    }

    public ModelJuego getJuegoId(int id) {
        return repositoryJuego.findById(id).orElse(null);
    }

    public ModelJuego updateModelJuego(ModelJuego juego) {
        if (!repositoryJuego.existsById(juego.getIdJuego())){
            return null;
        }
        return repositoryJuego.save(juego);
    }

    public void deleteJuego(int id) {
        repositoryJuego.deleteById(id);
    }
    
}
