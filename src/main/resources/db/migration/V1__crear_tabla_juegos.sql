CREATE TABLE juegos (
    id_juego INT AUTO_INCREMENT PRIMARY KEY,
    nombre_juego  VARCHAR(250) NOT NULL,
    descripcion_juego VARCHAR(350),
    genero1_juego VARCHAR(250) NOT NULL,
    genero2_juego VARCHAR(250) NOT NULL,
    genero3_juego VARCHAR(250) NOT NULL,
    clasificacion_edad_juego VARCHAR(250) NOT NULL
);