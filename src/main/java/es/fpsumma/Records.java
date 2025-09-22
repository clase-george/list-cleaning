package es.fpsumma;
import java.time.LocalTime;
import java.util.*;

public record Records() {
    public record Asistente(String nombre, int edad, String email) {
        
        public static String nombreLimpio(String nombre){
            return nombre.trim().toLowerCase();
        }
        public static String primeraUpperCase(String nombre){
            nombre = Character.toUpperCase(nombre.charAt(0)) + nombre.substring(1); //dividimos el nombre en caracteres, hacemos que la posicion 0 se aplique el uppercase y luego le concatenamos los caracteres a partir de la primera con el substring
            return nombre;
        }
    }
    public record Artista(String nombre, Set<String> generos) {}
    public record Actuacion(String artista, String escenario, LocalTime inicio, LocalTime fin, int aforoMax) {}
    public record Venta(String id, String concepto, String categoria, int unidades, double unitario) {}
    public record Stand(String nombre, Set<String> tags) {}
    public record Producto(String nombre, double precio, Set<String> tags) {}
    public record ResultadoTop<T>(T item, double total) {}

}
