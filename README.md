# CrossMatch
Proyecto Semestral - Desarrollo Fullstack 1 - Fecha de inicio: 08-04-2026

### ▪ ¿Qué es CrossMatch?
CrossMatch es un trabajo actualmente en desarrollo para una página realizado en SpringBoot, (En primera instancia solo Backend) la cual tiene por objetivo realizar una recomendación "cruzada" entre distintos anime y juegos.

### ▪ ¿Cómo funciona?
La página va a tener dos apartados distintos, con la idea de que:


Si buscas un anime, te recomienda juegos parecidos.
<br>
Si buscas un juego, te recomienda animes parecidos.

Esta comparación se va a basar en etiquetas de género, haciendo una coincidencia con respecto a 3 similitudes distintas. 
En orden de prioridad descendente a partir de la cantidad de similitudes entre objetos anime y juego.

### ▪ Futuro del Proyecto
Este proyecto se está desarrollando para una clase de "Desarrollo Fullstack" en donde se realiza en primera instancia el Backend sin una fecha de término definida actualmente, este repositorio funciona como entregable para las evaluaciones del semestre y es necesario para el desarrollo de Fullstack 2. (Frontend)

<br>

## Instrucciones de ejecución

### 1) Requisitos
- Java 21
- Maven
- **Sistema MySQL** corriendo en `localhost:3307` (Usuario: `root`, sin contraseña)
- IDE Utilizado: VS Code (Pueden usarse Intellij o Eclipse también)
- Postman (Necesario para probar la API web)


### 2) Configuración de base de datos
Las propiedades del proyecto (lo que se encuentra en src/main/resources/application.properties) contiene estos datos de conexión:

```
spring.datasource.url=jdbc:mysql://localhost:3307/crossmatch?createDatabaseIfNotExist=true&useSSL=false&serverTimezone=UTC
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# Hibernate / JPA
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect

# Open-Meteo API (clima, sin API key)
openmeteo.base-url=https://api.open-meteo.com
````

El primer bloque de código crea una base de datos en caso de que no exista, en el puerto local 3307 (conectando a Laragon).
<br>
En el segundo bloque tenemos la adición de Hibernate y JPA, lo que permite crear las tablas SQL y realizar el manejo de entidades y persistencia.
<br>
En el tercer bloque utilizamos una API externa para el cumplimiento de la rúbrica en esta evaluación del proyecto.


### 3) Ejecución del Proyecto
Desde la carpeta raíz del proyecto (CrossMatch):

**Windows CMD (Directo con SpringBoot)**

```
.\mvnw.cmd spring-boot:run
```

<br>

**Compilar y ejecutar JAR en terminal** (VS Code, funcionaría en Linux)

```
./mvnw clean package
```
```
java -jar target/CrossMatch-0.0.1-SNAPSHOT.jar
```

## 4) URL de la API

Por defecto Spring Boot levanta en puerto 8080:

```
http://localhost:8080
```
Bases path del controlador:

```
/api/v1/juegos
```

```
/api/v1/animes
```

<br>

## **Contribuidores**
- Antonia Abarca (anabarcab-wq, xnto23)
- Tomás Aliaga (TomAlig)
- Carlos Sepulveda (carlossepulvedadiaz)


Se corrigieron commits asociados a usuarios incorrectos.

<br>

## ***Commit Log** (Registro de los Commits + autores, más descriptivo)*
<details>
  <summary>Haga clic aquí para desplegar Log</summary>
  <br>
  
 **TomAlig** - 08/04/2026 - Creación del repositorio.

 
**anabarcab-wq** - 14/04/2026 - Se sube el Initializer de SpringBoot.


**TomAlig y carlossepulvedadiaz** - 15/04/2026 - Se actualiza el pom.xml con dependencias de MySQL y se crean los modelos / tablas a utilizar.


**anabarcab-wq** - 17/04/2026 - Se modifican los nombres de las tablas y sus atributos para encajar mas con los requerimientos, también conectando a base de datos local en Laragon.


**anabarcab-wq y TomAlig** - 21/04/2026 - Se cambian los nombres de id para ser más descriptivos, también se establece la relación entre modelos y tablas y se actualiza README.


**anabarcab-wq** - 22/04/2026 - Se arregla la relación entre los modelos y tablas.


**TomAlig** - 24/04/2026 - Se suben las bases de los repositorios.


**carlossepulvedadiaz** - 28/04/2026 - Se implementa Flyway, y se agregan las tablas respectivas para los modelos.


**TomAlig** - 06/05/2026 - Se corrige la implementación de Flyway y se añaden carpetas y archivos Service y Controller. (Se vuelven a subir en un solo commit)


**anabarcab-wq** (Principal responsable del rollback) - 11-14/05/2026 - En este tramo de trabajo, hubo varias complicaciones en la implementación de Flyway como migración a la base de datos, por lo que optamos a utilizar solo hibernate con JPA.


**TomAlig, anabarcab-wq y carlossepulvedadiaz** - 15/05/2026 - Se añade un DTO sin utilizar y uno para la api externa, sus respectivos service, controller y config y un manejo de excepciones general con @RestControllerAdvice. Además se hace la primera versión de la colección de Postman, (10 de anime y 10 de juegos) en principio no funcional.

**anabarcab-wq** - 20/05/2026 - Se actualiza postman agregando el CRUD actual y se comprueba su funcionamiento.

**anabarcab-wq** - 22/05/2026 - Se actualiza postman agregando WeatherAPI.

**TomAlig** - 03/06/2026 - Se agregan bases para Swagger y para Spring Security.

</details>
