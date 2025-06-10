# Proyecto Observer con AspectJ
# Integrantes
- Jahir Cajas
-
-
-
## Descripción

Este proyecto demuestra el uso del patrón Observer junto con programación orientada a aspectos (AOP) usando AspectJ. La interfaz gráfica está desarrollada con JavaFX.

## Funcionalidad principal

- La ventana contiene tres botones que cambian el color de fondo (Rojo, Verde, Azul).
- Se utilizan observadores para reaccionar a los cambios de color.

## Uso de AspectJ

Se define un aspecto (`LoggerAspect.aj`) que intercepta las llamadas al método `setColor` de la clase `Subject` y muestra en consola un mensaje indicando el nuevo color, sin modificar la lógica de la clase.

## Funcionalidad adicional

Se implementó un observador adicional llamado `CounterObserver` que cuenta cuántas veces se ha cambiado el color de la ventana. Este observador ejemplifica claramente cómo separar funcionalidades usando el patrón Observer y AspectJ, ya que se añadió sin modificar la lógica principal del sistema.
