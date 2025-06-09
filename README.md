# Estructuras Lineales - Pilas Colas

## 📌 Información General

- **Título:** Estructuras Lineales - Pilas Colas
- **Asignatura:** Estructura de Datos
- **Carrera:** Computación
- **Estudiantes:** Daniel Cajas
- **Fecha:** 08/06/2025
- **Profesor:** Ing. Pablo Torres

---

## 🛠️ Descripción

Versión 2.0.2
Esta versión incluye la implementación de los siguientes ejercicios:

### Ejercicio 1: Validación de signos en cadenas
- Método ValidadorSignos.esValido(String cadena) que verifica si una cadena con paréntesis, llaves y corchetes está correctamente balanceada.
- Utiliza una estructura de datos tipo pila (Stack) para hacer el seguimiento de los signos de apertura y cierre.

### Ejercicio 2: Ordenación de una pila (Stack)
- Clase OrdenadoPila con el método ordenar(Stack original) que ordena los elementos del stack de menor a mayor.
- Solo utiliza pilas adicionales para ordenar sin copiar datos a otras estructuras.
- La pila resultante tiene los elementos más pequeños en el tope.

### Estructura Stack
- Implementación propia de una pila genérica (o basada en Object) que soporta operaciones básicas: push, pop, peek y isEmpty.
- Utilizada como base para los ejercicios 1 y 2.

Esta versión ha sido probada y funciona correctamente con los casos de prueba indicados en la práctica.
---
## 🚀 Ejecución

Para ejecutar el proyecto:

1. Compila el código:
    ```bash
    javac App.java
    ```
2. Ejecuta la aplicación:
    ```bash
    java App
    ```

---
## 🧑‍💻 Ejemplo de Salida

```plaintext
EJERCICIO 1:
-------------------------
Ejemplo 1:
´([]){}´
true
 
Ejemplo 2:
´({)}´
false

EJERCICIO 2:
-------------------------
Pila sin ordenar:
5 1 4 2
Pila ordenada:
1 2 4 5 
