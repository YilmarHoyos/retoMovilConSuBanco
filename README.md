# RetoConsubancoMovil

Este proyecto es una automatización de pruebas para la aplicación móvil "The App" de Consubanco, utilizando Java y Gradle.

## Estructura del proyecto
- `src/main/java/`: Código fuente principal.
- `src/test/java/`: Pruebas automatizadas.
- `src/main/resources/`: Recursos de la aplicación.
- `src/test/resources/`: Recursos para pruebas (features, datos, etc).
- `build.gradle`: Configuración de Gradle.
- `bin/`, `build/`, `target/`: Carpetas generadas por el proceso de construcción y pruebas.

## Requisitos
- Java 8 o superior
- Gradle
- Un emulador o dispositivo Android para ejecutar las pruebas

## Instalación
1. Clona el repositorio:
   ```sh
   git clone <url-del-repositorio>
   ```
2. Ingresa al directorio del proyecto:
   ```sh
   cd RetoConsubancoMovil
   ```
3. Instala las dependencias:
   ```sh
   gradlew build
   ```

## Ejecución de pruebas
Para ejecutar las pruebas automatizadas:
```sh
./gradlew test
```

## Generación de reportes
Los reportes de pruebas se generan en la carpeta `build/reports/tests/test` y los reportes de problemas en `build/reports/problems`.

## Contribución
1. Haz un fork del repositorio.
2. Crea una rama para tu feature o fix.
3. Realiza tus cambios y haz commit.
4. Envía un pull request.

## Licencia
Este proyecto es propiedad de Consubanco. Uso interno y educativo.
