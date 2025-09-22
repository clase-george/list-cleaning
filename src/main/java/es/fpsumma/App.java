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

        for(Asistente a : asistentes){
            String nombreLimpio = Asistente.nombreLimpio(a.nombre());
            String primerUpperCase = Asistente.primeraUpperCase(nombreLimpio);
            System.out.println(primerUpperCase);
        }
        
    }
}
