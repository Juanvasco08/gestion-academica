Sistema de Gestión Académica

Este proyecto es una API REST desarrollada en Java con Spring Boot para administrar la información básica de un entorno escolar: estudiantes, profesores, registro de faltas y, lo más importante, el cálculo de calificaciones.

¿En qué me basé para hacerlo?

Para la lógica principal de las notas me basé en el sistema de calificación que usamos en mi colegio, la Institución Educativa Técnico Industrial Santiago de Arma. Allá la evaluación de cada periodo se divide en dos partes grandes que al final suman el 100%:

El 70% (Seguimiento): Es todo lo que se va acumulando durante el periodo (talleres, quices, trabajos en clase, participación, etc.).

El 30% (Acumulativo): Al final de cada periodo nos hacen un examen acumulativo sobre todo lo visto, el cual tiene ese peso del 30%.

Quise llevar esa misma regla de negocio al código para que el sistema no solo guardara números, sino que calculara la nota definitiva real de un estudiante automáticamente.

Tecnologías y herramientas utilizadas

Java y Spring Boot: Para construir toda la estructura del backend y exponer los servicios web.

MySQL: Como motor de base de datos relacional para guardar de forma persistente los registros de estudiantes, profesores, notas y faltas, manejando las llaves foráneas para conectar cada nota y falta con su respectivo estudiante.

Swagger UI: Para probar todos los endpoints directamente desde el navegador sin tener que construir un frontend todavía.

Apoyo con Inteligencia Artificial: Durante el desarrollo me apoyé en herramientas de IA como guía para resolver dudas puntuales con las relaciones en JPA, estructurar mejor los JSON de prueba, depurar errores de compilación y pulir la lógica del servicio de notas.

Cómo funciona la lógica del programa

El proyecto está organizado por capas (Entity, DAO/Repository, Service y Controller) para mantener el orden:

Entidades y Base de Datos: Se crearon las tablas principales (estudiantes, profesores, notas, faltas). Para notas y faltas se configuró una relación hacia estudiantes usando su id, asegurando que no se pueda registrar una nota o una inasistencia a alguien que no exista en el sistema.

Métodos POST: Se hicieron para ingresar la información nueva a la base de datos. Por ejemplo, al mandar el JSON de una nota, se le pasa el objeto del estudiante con su ID, el valor de la calificación y el tipo (70% o 30%).

Métodos GET: Sirven para consultar los registros guardados (ver todos los estudiantes, listar las notas, revisar las faltas, etc.).

Cálculo de la definitiva (GET /api/notas/definitiva/{estudianteId}): Esta es la parte central del programa. En el notaService, el código busca todas las notas asociadas al ID del estudiante que se le pase por la URL, separa las que corresponden al seguimiento (70%) y las del examen final (30%), las multiplica por su respectivo porcentaje (0.70 y 0.30) y suma ambos resultados para devolver la nota final del periodo.

Métodos DELETE: Se dejaron listos para poder borrar registros por su ID en caso de que algún dato se ingrese mal.

Cómo ejecutarlo

Tener encendido el servidor local de MySQL con la base de datos configurada en el archivo application.properties.

Abrir el proyecto en el IDE (IntelliJ o Eclipse) o desde la terminal en la carpeta raíz y correr:

./mvnw spring-boot:run


Entrar en el navegador a http://localhost:8080/swagger-ui/index.html para interactuar con los endpoints y hacer las pruebas.
