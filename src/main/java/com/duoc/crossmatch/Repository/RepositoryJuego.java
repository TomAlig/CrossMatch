package com.duoc.crossmatch.Repository;

import org.springframework.stereotype.Repository;
import com.duoc.crossmatch.Model.ModelJuego;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RepositoryJuego extends JpaRepository<ModelJuego, Integer> {
    }
