package com.duoc.crossmatch.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.duoc.crossmatch.Dto.WeatherDTO;
import com.duoc.crossmatch.Service.ServiceWeather;

@RestController
@RequestMapping("/api/v1/clima")
public class ControllerWeather {

    @Autowired
    private ServiceWeather ServiceWeather;

    /**
     * Devuelve el clima actual para las coordenadas indicadas.
     * Por defecto usa Santiago de Chile (lat=-33.45, lon=-70.65).
     *
     * Ejemplos:
     *   GET /api/v1/clima                          → Santiago (default)
     *   GET /api/v1/clima?lat=-41.47&lon=-72.94   → Puerto Montt
     */
    @GetMapping
    public ResponseEntity<WeatherDTO> clima(
            @RequestParam(defaultValue = "-33.45") double lat,
            @RequestParam(defaultValue = "-70.65") double lon) {

        System.out.println("[ControllerWeather] -> clima lat=" + lat + ", lon=" + lon);
        WeatherDTO resultado = ServiceWeather.obtenerClima(lat, lon);
        return ResponseEntity.ok(resultado);
    }
}