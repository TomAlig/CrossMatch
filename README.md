# CrossMatch
Proyecto Semestral - Desarrollo Fullstack 1 - Fecha de inicio: 08-04-2026

### * ¿Que es CrossMatch?
CrossMatch es un trabajo en progreso para una pagina realizado en SpringBoot, (En primera instancia solo Backend) la cual tiene por objetivo realizar una recomendacion "cruzada" entre distintos anime y juegos.

### * ¿Como funciona?
La pagina va a tener dos apartados distintos, con la idea de que, si el usuario busca un juego que tenga parecido con algun anime que haya visto, se le de basado en el ingreso del nombre de dicho anime, esto funciona de la misma manera viceversa; buscando un anime basado en un juego.

Esta comparacion se va a basar en etiquetas de genero, haciendo una coincidencia con respecto a 3 similitudes distintas.
En orden de prioridad descendiente a partir de la cantidad de similitudes entre objetos anime y juego.

### * Futuro del Proyecto
Este proyecto se esta desarrollando para una clase de "Desarrollo Fullstack" en donde se realiza en primera instancia el Backend sin una fecha de termino definida actualmente, este repositorio funciona como entregable para las evaluaciones del semestre y es necesario para el desarrollo de Fullstack 2. (Frontend)

## Instrucciones de ejecución


### 1) Requisitos
- Java 21
- Maven
- Sistema **MySQL** corriendo en `localhost:3307` (Usuario: `root`, sin contraseña)
- IDE Utilizado: VS Code (Pueden usarse Intellij o Eclipse tambien)
- Postman (Necesario para probar la API web)

### 2) Configuración de base de datos
Las propiedades del proyecto (lo que se encuentra en `src/main/resources/application.properties`) contiene estos datos de conexion:
```
spring.datasource.url=jdbc:mysql://localhost:3307/crossmatch?createDatabaseIfNotExist=true&useSSL=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# Hibernate / JPA
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect

# Open-Meteo API (clima, sin API key)
openmeteo.base-url=https://api.open-meteo.com
```
El primer bloque de datos crea una base de datos de no ser existente, y define usuario y contraseña.

En el segundo, tenemos la adición de Hibernate y JPA, lo que asistira en el llenado de tablas SQL y las funciones Spring.

En el tercero, utilizamos una API externa para el cumplimiento de la rubrica en esta evaluacion del proyecto.


### 3) Ejecucion del Proyecto
Desde la carpeta raíz del proyecto (CrossMatch):


`.\mvnw.cmd spring-boot:run` - En CMD.


`./mvnw clean package
java -jar target/CrossMatch-0.0.1-SNAPSHOT.jar` - Compilar y ejecutar JAR en terminal.

## 4) URL de la API
Por defecto Spring Boot levanta en puerto 8080:


`http://localhost:8080`


Bases path del controlador:


`/api/v1/juegos`
`/api/v1/animes`


## **Contribuidores**
- Antonia Abarca (anabarcab-wq, xnto23)
- Tomás Aliaga (TomAlig)
- Carlos Sepulveda  (carlossepulvedadiaz)
(lulilulita fue un usuario mal logeado en el proyecto, sobreescribiendo commits, esto fue corregido.)

## ***Commit Log** (Registro de los Commits + autores, mas descriptivo)*  

**TomAlig** - 08/04/2026 - Creacion del repositorio.  


**anabarcab-wq** - 14/04/2026 - Se sube el Initializer de SpringBoot. 


**TomAlig y carlossepulvedadiaz** - 15/04/2026 - Se actualiza el pom.xml con dependencias de MySQL y se crean los modelos / tablas a utilizar. 


**anabarcab-wq** - 17/04/2026 - Se modifican los nombres de las tablas y sus atributos para encajar mas con los requerimientos, tambien conectando a base de datos local en Laragon.  


**anabarcab-wq y TomAlig** - 21/04/2026 - Se cambian los nombres de id para ser mas descriptivos, tambien se establece la relacion entre modelos y tablas y se actualiza README. 


**anabarcab-wq** - 22/04/2026 - Se arregla la relacion entre los modelos y tablas.


**TomAlig** - 24/04/2026 - Se suben las bases de los repositorios. 


**carlossepulvedadiaz** - 28/04/2026 - Se implementa Flyway, y se agregan las tablas respectivas para los modelos. 


**TomAlig** - 06/05/2026 - Se corrige la implementación de Flyway y se añaden carpetas y archivos Service y Controller. (Se re-pushean en un solo Commit) 


**anabarcab-wq** (Principal responsable del rollback) - 11-14/05/2026 - En este tramo de trabajo, hubo varias complicaciones en la implementación de Flyway como migración a la base de datos, por lo que optamos a utilizar solo hibernate con JPA. 


**TomAlig, anabarcab-wq y carlossepulvedadiaz** - 15/05/2026 - Se añade un DTO sin utilizar y uno para la api externa, sus respectivos service, controller y config y un manejo de excepciones general con @RestControllerAdvice. Ademas se hace la primera version de la coleccion de Postman, (10 de anime y 10 de juegos) en principio no funcional.
