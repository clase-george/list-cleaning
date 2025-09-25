package es.fpsumma;
import java.time.LocalTime;
import java.util.*;
import java.util.regex.Pattern;

public record Records() {
    public record Asistente(String nombre, int edad, String email) {

        public static String nombreLimpio(String nombre){
            return nombre.trim().toLowerCase();
        }
        public static String primeraUpperCase(String nombre){
            //return Character.toUpperCase(nombre.charAt(0)) + nombre.substring(1); //dividimos el nombre en caracteres, hacemos que la posicion 0 se aplique el uppercase y luego le concatenamos los caracteres a partir de la primera con el substring
            return nombre.substring(0,1).toUpperCase() + nombre.substring(1); //otra forma de hacerlo, con substring tomamos el primer caracter y le aplicamos el uppercase y luego le concatenamos el resto del string a partir de la primera posicion
        }
        public static void emailValido(List<Asistente> asistentes){
            String emailRegex = "^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$";  //este regex indica que debe haber 1 o mas caracteres que no sean @, luego una @, luego nuevamente lo primero, luego un . literal y otrra vez lo primero
            Pattern verificador = Pattern.compile(emailRegex); //creamos un patron con el regex, que es algo que viene dado en la libreria
            asistentes.removeIf(asistente->asistente.email()==null || //verificamos que no sea nulo
            asistente.email().trim().isEmpty() || //verificamos que si quitamos los espacios(trim) no quede vacio
            !verificador.matcher(asistente.email()).matches()); //verificamos con matcher que el email cumple el patron del regex, si no lo cumple lo eliminamos
        }
        public static void eliminarDuplicados(List<Asistente> asistentes){
            Set<String> correo = new HashSet<>(); //creamos un set para almacenar los nombres que ya hemos visto, el set no permite duplicados
            asistentes.removeIf(asistente-> !correo.add(asistente.email())); //En el lambda puedo poner lo que sea, se sobre entiende que es un elemento de la lista
        }                                                                    //se borrara de la lista el elemento asistente que no se añada al Hash ya que eso significa que esta repetido
    }
    public record Artista(String nombre, Set<String> generos) {}
    public record Actuacion(String artista, String escenario, LocalTime inicio, LocalTime fin, int aforoMax) {}
    public record Venta(String id, String concepto, String categoria, int unidades, double unitario) {}
    public record Stand(String nombre, Set<String> tags) {}
    public record Producto(String nombre, double precio, Set<String> tags) {}
    public record ResultadoTop<T>(T item, double total) {}

}
