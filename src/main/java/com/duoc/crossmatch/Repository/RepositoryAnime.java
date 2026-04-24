package com.duoc.crossmatch.Repository;

import org.springframework.stereotype.Repository;
import com.duoc.crossmatch.Model.ModelAnime;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RepositoryAnime extends JpaRepository<ModelAnime, Integer> {
    }
