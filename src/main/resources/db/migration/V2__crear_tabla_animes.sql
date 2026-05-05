CREATE TABLE animes (
    id_anime INT AUTO_INCREMENT PRIMARY KEY,
    nombre_anime  VARCHAR(250) NOT NULL,
    descripcion_anime VARCHAR(250), --puede ser null
    genero1_anime VARCHAR(250) NOT NULL,
    genero2_anime VARCHAR(250) NOT NULL,
    genero3_anime VARCHAR(250) NOT NULL,
    clasifiacacion_edad_anime VARCHAR(250) NOT NULL
);