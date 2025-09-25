package es.fpsumma;

import java.util.ArrayList;
import java.util.List;
import es.fpsumma.Records.Asistente;
public class App 
{
    public static void main( String[] args )
    {
        List<Asistente> asistentes = new ArrayList<>(List.of(
            new Asistente("  ana  ", 30, "ana@mail.com"),
            new Asistente("LUIS", 17, "x@x"),
            new Asistente("Ana", 30, "ana@mail.com"),
            new Asistente("Nora", 25, "  "),
            new Asistente("Óscar", 40, "oscar@mail.es")
        ));

        //Mostramos los nombres limpios, este metodo solo modifica impresion pantalla
        for(Asistente a : asistentes){
            String nombreLimpio = Asistente.nombreLimpio(a.nombre());
            String primerUpperCase = Asistente.primeraUpperCase(nombreLimpio);
            System.out.println(primerUpperCase);
        }
        //Mostramos solo los asistentes con email valido, este modifica la lista en si
        Asistente.emailValido(asistentes);
        System.out.println("Asistentes con email valido:");
        for(Asistente a : asistentes){
            System.out.println(a);
        }

        //MOstamos nombre limpio y correo valido correos sin duplicar, este modifica la lista en si
        Asistente.eliminarDuplicados(asistentes);
        System.out.println("Asistentes sin duplicados:");
        for(Asistente a : asistentes){
            String nombreLimpio = Asistente.nombreLimpio(a.nombre());
            String primerUpperCase = Asistente.primeraUpperCase(nombreLimpio);
            System.out.println(primerUpperCase + " - " + a.email());
        }
    }
}
