package es.fpsumma;
import java.time.LocalTime;
import java.util.*;

public record Records() {
    public record Asistente(String nombre, int edad, String email) {}
    public record Artista(String nombre, Set<String> generos) {}
    public record Actuacion(String artista, String escenario, LocalTime inicio, LocalTime fin, int aforoMax) {}
    public record Venta(String id, String concepto, String categoria, int unidades, double unitario) {}
    public record Stand(String nombre, Set<String> tags) {}
    public record Producto(String nombre, double precio, Set<String> tags) {}
    public record ResultadoTop<T>(T item, double total) {}

}
