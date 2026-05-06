package com.duoc.crossmatch.Service;

import com.duoc.crossmatch.Model.ModelAnime;
import com.duoc.crossmatch.Repository.RepositoryAnime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceAnime {

    @Autowired
    private RepositoryAnime repositoryAnime;

    public List<ModelAnime> getAnimes(){
        return repositoryAnime.findAll();
    }

    public ModelAnime saveAnime(ModelAnime anime) {
        return repositoryAnime.save(anime);
    }

    public ModelAnime getAnimeId(int id) {
        return repositoryAnime.findById(id).orElse(null);
    }

    public ModelAnime updateAnime(ModelAnime anime) {
        if (!repositoryAnime.existsById(anime.getIdAnime())){
            return null;
        }
        return repositoryAnime.save(anime);
    }

    public void deleteAnime(int id) {
        repositoryAnime.deleteById(id);
    }

}
