# Proyecto Observer con JavaFX y AspectJ
# Integrantes
- Jahir Cajas
## Descripción
Este proyecto demuestra el uso del patrón Observer junto con programación orientada a aspectos (AOP) usando AspectJ, que es una técnica de programación que se usa para separar ciertos tipos de funcionalidades transversales (cross-cutting concerns) del código principal de la aplicación. La interfaz gráfica está desarrollada con JavaFX. 

## Funcionalidad principal  
- La ventana contiene tres botones que permiten cambiar el color de fondo (Rojo, Verde, Azul).  
- La clase `Subject` implementa el patrón Observer, notificando a los observadores registrados cada vez que el color cambia.  
- Se utilizan aspectos para **loggear el cambio de color** y **contar cuántas veces se cambia el color** sin modificar la lógica del patrón Observer.

## Uso de AspectJ  
- El aspecto `LoggerAspect` intercepta las llamadas a `setColor` y muestra en consola un mensaje con el color nuevo.  
- El aspecto `CounterAspect` lleva un contador de cambios y muestra la cantidad total cada vez que cambia el color.

## Funcionalidad adicional  
- Se implementó el aspecto `CounterAspect` para contar los cambios de color, demostrando cómo AspectJ puede complementar el patrón Observer y facilitar la separación de responsabilidades.
- 
## Programa en ejecución
![Captura de pantalla 2025-06-10 135234](https://github.com/user-attachments/assets/83abc148-ee43-4e2c-9c87-66f11c68e575)
![Captura de pantalla 2025-06-10 135322](https://github.com/user-attachments/assets/925c3299-2cf2-4d48-b774-c6ba98f27561)
![Captura de pantalla 2025-06-10 135338](https://github.com/user-attachments/assets/cfba0b17-7c07-4481-81f4-755342597164)
![Captura de pantalla 2025-06-10 135353](https://github.com/user-attachments/assets/81bde80c-082d-484b-bcdd-581967e84424)
