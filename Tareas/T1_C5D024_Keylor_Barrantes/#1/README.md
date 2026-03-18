1. ¿Qué problema de diseño observa en las clases CajaString y CajaInteger?
El código se repite mucho; es el mismo, solo cambia el tipo de dato que aceptan.

2. ¿Qué pasaría si necesitáramos una caja para Double, Boolean o Persona?
Tendríamos que duplicar aún más código para cada tipo.

3. ¿Por qué este diseño no escala bien?
Porque obliga a crear código nuevo por cada tipo de dato diferente.

-- 

1. ¿Por qué el atributo contenido se declara como tipo T y no como Object?
Porque T permite usar cualquier tipo, no solo Object.

2. ¿En qué momento Java determina el tipo que usará la Caja?
En tiempo de compilación.

3. ¿Por qué los genéricos ayudan a evitar errores en tiempo de ejecución?
Porque detectan errores de tipo antes de ejecutar el programa.