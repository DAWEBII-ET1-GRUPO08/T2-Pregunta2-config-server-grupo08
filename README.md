# config-server-grupo08

Servidor Spring Cloud Config del Grupo 08 para ClinicaCloud. Centraliza la configuración de los microservicios y descifra propiedades con el prefijo `{cipher}` usando una clave simétrica.

## Requisitos

- Java 25
- Spring Boot 4.1.1
- Spring Cloud 2025.1.3

## Ejecución

1. Verificar que el repositorio `T2-Pregunta2-config-repo-grupo08` esté publicado en GitHub.
2. Definir la variable de entorno `ENCRYPT_KEY` con la clave entregada para la evaluación.
3. Abrir este proyecto como Maven en IntelliJ IDEA y agregar `ENCRYPT_KEY` en la configuración de ejecución.
4. Ejecutar `ConfigServerGrupo08Application`.
5. Consultar la configuración de desarrollo: `GET http://localhost:8888/cita-service/dev`.

El servidor se ejecuta en el puerto `8888`. `bootstrap.properties` define `encrypt.key`, obtenido desde una variable de entorno para que la clave no quede publicada en GitHub.
