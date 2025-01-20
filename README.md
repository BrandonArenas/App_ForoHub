# Foro Hub
Foro Hub es una API RESTful creada con Spring Boot para la gestión de tópicos en un foro. Permite crear, leer, actualizar y eliminar tópicos.

---
## Características
- **Crear un nuevo tópico**: Permite a los usuarios crear un tópico con título, mensaje, autor, y curso.
- **Ver todos los tópicos**: Lista todos los tópicos creados en el foro.
- **Ver un tópico específico**: Muestra los detalles de un tópico específico mediante su ID.
- **Actualizar un tópico**: Permite a los usuarios modificar los datos de un tópico existente.
- **Eliminar un tópico**: Elimina un tópico del foro.
---
## Requisitos
- Java 17 o superior instalado en tu máquina.
- MySQL configurado y en funcionamiento.
- Spring Boot 3.x.
- Maven para gestionar las dependencias.
- IDE recomendado: IntelliJ IDEA (aunque puedes usar cualquier editor de tu preferencia).
---

## API REST
La aplicación también proporciona una API RESTful para interactuar con los tópicos. Los endpoints disponibles son:


```json
{ 
    "id" : "Id",
    "title": "Título", 
    "message": "Mensaje",
    "fecha_creacion": "yyyy-mm-dd hh:mm:ss",
    "status": "ACTIVO",
    "author": "Autor", 
    "course": "Curso"
}
```
- **GET /topics**: Obtener todos los tópicos.
- **GET /topics/{id}**: Obtener un tópico específico por ID.
- **PUT /topics/{id}**: Actualizar un tópico específico por ID.
- **DELETE /topics/{id}**: Eliminar un tópico específico por ID.
- **Migraciones de la base de datos**:
La aplicación utiliza Flyway para gestionar las migraciones de la base de datos. Cuando se inicia la aplicación, Flyway aplica las migraciones definidas en los archivos SQL dentro del proyecto para crear las tablas necesarias.
---
## Tecnologías utilizadas
- Java 17 (o superior)
- Spring Boot 3.x
- Spring Data JPA para la persistencia de datos
- MySQL como sistema de base de datos
- Flyway para la gestión de migraciones de base de datos
- Spring Security para la autenticación y autorización
- Lombok para reducir el código repetitivo (como los getters y setters)