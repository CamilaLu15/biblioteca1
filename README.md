# 📚 Sistema de Gestión de Biblioteca - Trabajo Práctico POO

Este proyecto es una aplicación de consola desarrollada en Java puro, diseñada para gestionar el sistema de préstamos de la biblioteca de la facultad. Implementa los principios fundamentales de la Programación Orientada a Objetos (POO), manejo dinámico de colecciones y control de errores personalizados.

## 🚀 Características Principales

El sistema cumple con todos los requisitos funcionales del Trabajo Práctico, incluyendo:

* **Gestión de Entidades:** Modelado de clases para `Libro`, `Estudiante` y `Prestamo` con encapsulamiento estricto.
* **Manejo de Colecciones:** * `ArrayList` para el catálogo general de libros.
  * `HashMap` para la búsqueda instantánea de estudiantes mediante su legajo.
  * `HashSet` para el registro de préstamos activos (evitando duplicados mediante la sobrescritura de `equals` y `hashCode`).
* **Control de Excepciones Personalizadas:** Prevención de fallos mediante clases de error propias (`LibroNoDisponibleException`, `EstudianteNoEncontradoException`, `LimitePrestamosExcedidoException`).
* **Cálculo Recursivo de Multas:** Algoritmo recursivo con límite de iteraciones para calcular penalizaciones por días de retraso en las devoluciones.
* **Búsquedas Inteligentes:** Motor de búsqueda parcial y *case-insensitive* utilizando la API de Streams de Java.

## 📁 Estructura del Proyecto

El código fuente está organizado en paquetes para separar las responsabilidades del sistema (Arquitectura en capas):

```text
src/
 └── unlar/edu/ar/
      ├── Excepciones/       # Clases de error personalizadas
      ├── Modelo/            # Entidades puras (Libro, Estudiante, Prestamo)
      ├── Sistema/           # Lógica de negocio y colecciones (SistemaBiblioteca)
      └── App.java           # Clase principal (Main) y script de pruebas
```

## 🛠️ Tecnologías Utilizadas

* **Lenguaje:** Java 
* **Librerías principales:** `java.util` (Collections, Streams), `java.time` (Fechas exactas para préstamos y devoluciones).
* **Paradigma:** Programación Orientada a Objetos (POO).

## ⚙️ Ejecución del Script de Pruebas

Para probar el sistema, simplemente ejecuta la clase `App.java`. El programa incluye un script automatizado que demuestra:
1. Carga de datos inicial (Libros y Estudiantes).
2. Intentos de préstamos exitosos y fallidos (disparando las excepciones personalizadas).
3. Listado de tickets de préstamos activos con cálculo automático de fechas.
4. Devoluciones de libros y liberación de stock.
5. Cálculo matemático recursivo de multas por retraso.
6. Búsqueda de libros parcial ignorando mayúsculas/minúsculas.

## ✒️ Autores
* Camila Lucero
* Joaquín Codocea
