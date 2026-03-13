Enunciado

A continuación se presenta un ejemplo de un sistema que gestiona diferentes tipos de transportes. El sistema pretende modelar vehículos que pueden realizar distintas acciones como conducir, volar o navegar.

El sistema fue desarrollado por un programador que no tenía conocimientos sobre principios de diseño de software, por lo que la solución actual presenta varios problemas de diseño relacionados con herencia y reutilización del código.

Como resultado, algunas clases están obligadas a implementar comportamientos que no tienen sentido para ciertos tipos de transporte, lo cual provoca excepciones o comportamientos incorrectos durante la ejecución del programa.

Su tarea consiste en analizar la arquitectura existente y proponer una refactorización del sistema aplicando principios de diseño orientados a objetos, especialmente el Principio de Sustitución de Liskov (LSP).

Instrucciones

Analice la implementación ubicada en la carpeta incorrect.

Identifique los problemas de diseño presentes en el código.

Explique brevemente por qué la solución actual viola el Principio de Sustitución de Liskov.

Proponga una nueva arquitectura que solucione estos problemas.

Implemente la solución corregida en la carpeta correct.

Requisitos de la solución

Mantener el comportamiento general del sistema.

Evitar que las clases implementen métodos que no corresponden a su tipo de transporte.

Aplicar correctamente el uso de herencia o interfaces cuando sea necesario.

Diseñar una arquitectura que permita extender el sistema fácilmente con nuevos tipos de transporte.

HINT

Piense en cómo la clase principal del sistema (Library o gestor del sistema) se encarga de llamar las funcionalidades, y analice cuáles responsabilidades podrían delegarse a servicios o clases especializadas.

Preguntas de análisis

¿Qué problema presenta la clase base Transport?

¿Por qué algunas subclases lanzan excepciones?

¿Cómo podría rediseñarse la jerarquía para evitar este problema?
