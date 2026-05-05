CREATE TABLE juegos (
    id_juego INT AUTO_INCREMENT PRIMARY KEY,
    nombre_juego  VARCHAR(250) NOT NULL,
    descripcion_juego VARCHAR(250), --puede ser null
    genero1_juego VARCHAR(250) NOT NULL,
    genero2_juego VARCHAR(250) NOT NULL,
    genero3_juego VARCHAR(250) NOT NULL,
    clasifiacacion_edad_juego VARCHAR(250) NOT NULL
);