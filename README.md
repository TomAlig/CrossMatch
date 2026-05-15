# CrossMatch
Proyecto Semestral - Desarrollo Fullstack 1 - Fecha de inicio: 08-04-2026

### ¿Que es CrossMatch?
CrossMatch es un trabajo en progreso para una pagina realizado en SpringBoot, (En primera instancia solo Backend) la cual tiene por objetivo realizar una recomendacion "cruzada" entre distintos anime y juegos.

### ¿Como funciona?
La pagina va a tener dos apartados distintos, con la idea de que, si el usuario busca un juego que tenga parecido con algun anime que haya visto, se le de basado en el ingreso del nombre de dicho anime, esto funciona de la misma manera viceversa; buscando un anime basado en un juego.

Esta comparacion se va a basar en etiquetas de genero, haciendo una coincidencia con respecto a 3 similitudes distintas.
En orden de prioridad descendiente a partir de la cantidad de similitudes entre objetos anime y juego.

### Futuro del Proyecto
Este proyecto se esta desarrollando para una clase de "Desarrollo Fullstack" en donde se realiza en primera instancia el Backend sin una fecha de termino definida actualmente, este repositorio funciona como entregable para las evaluaciones del semestre y es necesario para el desarrollo de Fullstack 2. (Frontend)

***Commit Log** (Registro de los Commits, mas descriptivo)*  

08/04/2026 - Creacion del repositorio.  

14/04/2026 - Se sube el Initializer de SpringBoot.  

15/04/2026 - Se actualiza el pom.xml con dependencias de MySQL y se crean los modelos / tablas a utilizar.  

17/04/2026 - Se modifican los nombres de las tablas y sus atributos para encajar mas con los requerimientos, tambien conectando a base de datos local en Laragon.  

21/04/2026 - Se cambian los nombres de id para ser mas descriptivos, tambien se establece la relacion entre modelos y tablas y se actualiza README.

22/04/2026 - Se arregla la relacion entre los modelos y tablas.

24/04/2026 - Se suben las bases de los repositorios.

28/04/2026 -Se implementa Flyway, y se agregan las tablas respectivas para los modelos. 

06/05/2026 -Se corrije la implementacion de Flyway y se añaden carpetas y archivos Service y Controller. (Se re-pushean en un solo Commit)

11-14/05/2026 - En este tramo de trabajo, hubieron varias complicaciones en la implementacion de Flyway como migracion a la base de datos, por lo que optamos a utilizar solo hibernate con JPA.

15/05/2026 - Se añade un DTO sin utilizar y uno para la api externa, su respectivos service, controller y config y un manejo de excepciones general con @RestControllerAdvice, ademas se hace la primera version del Postman Collection, 10 de anime y 10 de juegos, en principio no funcional.
