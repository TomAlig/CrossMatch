package com.duoc.crossmatch.service;


import static org.junit.jupiter.api.Assertions.assertNotNull;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import com.duoc.crossmatch.Model.ModelAnime;
import com.duoc.crossmatch.Model.ModelJuego;
import com.duoc.crossmatch.Repository.RepositoryAnime;
import com.duoc.crossmatch.Service.ServiceAnime;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class ServiceTestAnime {
    @Mock
    private RepositoryAnime animeRepository;


    @InjectMocks
    private ServiceAnime animeService;


    @Test
    void testObtenerPrimerGenero() {
        List<ModelJuego> juego = new ArrayList<>(); //Lista vacia
        ModelAnime anime = new ModelAnime(3, "Detective Conan","aaa","Aventura","Drama","Thriller","+14", juego);


        Mockito.when(animeRepository.findById(3)).thenReturn(Optional.of(anime));
       
         ModelAnime resultado = animeService.getAnimeId(3);
            assertNotNull(resultado);
         Assertions.assertEquals("Aventura", resultado.getGenero1Anime());
    }
}
