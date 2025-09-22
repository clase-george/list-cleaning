# list-cleaning
Ejercicio 1 de repaso java I - Limpiar lista

## **1) Lista limpia de asistentes (List + Set + `removeIf`)**

**Situación:** tienes una inscripción masiva con duplicados y correos raros. **Datos:**
------------------------------------------------------
List<Asistente> asistentes = new ArrayList<>(List.of(
  new Asistente("  ana  ", 30, "ana@mail.com"),
  new Asistente("LUIS", 17, "x@x"),
  new Asistente("Ana", 30, "ana@mail.com"),
  new Asistente("Nora", 25, "  "),
  new Asistente("Óscar", 40, "oscar@mail.es")
));
------------------------------------------------------
**Tarea:**

1. **Normaliza** el `nombre` a *Título* (primera mayúscula, resto minúsculas) y **trimea** espacios.
2. **Elimina** registros con email vacío o inválido (regex sencilla `^[^@\s]+@[^@\s]+\.[^@\s]+$`).
3. **Quita duplicados** por `email` manteniendo **orden de llegada**. **Entrega:** `List<Asistente>` limpia. **Esperado (ejemplo):** Ana, Nora, Óscar, … (sin el “x@x”, sin repetidos).