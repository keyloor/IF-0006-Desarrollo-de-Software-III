1. Explique qué representa el símbolo <T> en este método.
<T> indica que el método print es genérico y puede usar cualquier tipo.

2. ¿El uso de métodos genéricos mejora la seguridad de tipos (type safety) y por qué?
Sí, porque como mencione antes el compilador verifica que se usen tipos correctos en tiempo de compilación.

3. Investigue y mencione al menos dos métodos genéricos existentes en la biblioteca estándar de Java.

Collections.sort(List<T> list)

Collections.max(Collection<T> coll)