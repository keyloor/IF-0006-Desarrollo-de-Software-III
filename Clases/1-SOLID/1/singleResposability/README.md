Enunciado

A continuación se presenta un ejemplo de un sistema de gestión para una biblioteca. El sistema debe permitir manejar diferentes aspectos del funcionamiento de una biblioteca, tales como:

el registro y almacenamiento de libros,

la gestión de usuarios,

y el procesamiento de préstamos y devoluciones de libros.

El sistema fue desarrollado por un programador que no tenía conocimiento sobre los principios de diseño de software, por lo que la implementación actual presenta problemas relacionados con la organización de responsabilidades dentro de las clases.

Debido a esto, existen clases que realizan demasiadas tareas al mismo tiempo, lo cual dificulta el mantenimiento, la extensión y la reutilización del sistema.

Su tarea consiste en analizar la arquitectura existente y proponer una solución mejor estructurada, aplicando principios de diseño orientado a objetos.

Instrucciones

Analice el código proporcionado en la carpeta incorrect.

Identifique los problemas de diseño presentes en la implementación actual.

Explique brevemente por qué el carepicha no respeta el principio de Responsabilidad Única (Single Responsibility Principle).

Proponga una nueva arquitectura que divida adecuadamente las responsabilidades del sistema.

Implemente la solución corregida en la carpeta correct.

Requisitos

Mantener las funcionalidades principales del sistema:

registrar libros

registrar usuarios

realizar préstamos

procesar devoluciones

Separar las responsabilidades en clases apropiadas.

Diseñar una estructura que permita extender el sistema fácilmente en el futuro.

HINT

Piense que la clase Library se encarga principalmente de coordinar las operaciones del sistema, pero muchas de sus funcionalidades podrían delegarse a servicios o clases especializadas encargadas de tareas específicas.

Preguntas de análisis

¿Qué responsabilidades tiene actualmente la clase Library?
¿Considera que la clase Library tiene una única responsabilidad?
¿Qué problemas podrían surgir si se agregan nuevas funcionalidades al sistema actual?
¿Qué partes del sistema podrían separarse en clases diferentes?
¿Por qué tener muchas responsabilidades en una sola clase dificulta el mantenimiento del código?
