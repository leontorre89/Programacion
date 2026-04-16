package Ficheros.Prueba1.Utils;

import Ficheros.Prueba1.Models.Persona;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Locale;
import java.util.Scanner;

public class ManejaFicherocsvPersona{
    String rutaCarpetaResources = "src\\main\\resources\\";
    public void muestraContenidoFich(String nombreFichero) throws FileNotFoundException {
        String rutaYNombre = rutaCarpetaResources + nombreFichero;
        Scanner in = null;
        try {
            // abre el fichero
            FileReader fichero = new FileReader(rutaYNombre);
            //Se crea el flujo
            in = new Scanner(fichero);
            // lee el fichero
            in.useLocale(Locale.ENGLISH);
            in.useDelimiter(",");
            while (in.hasNextLine()) { //Lectura palabra a palabra
                String persona = in.nextLine();
                String [] partes = persona.split(",");
                Persona p = new Persona(partes[0]);

                int numNotas = 0;

                for (int i = 1; i < partes.length; i++) {
                    float[] notas = p.getNotas();
                    notas[numNotas] = in.nextFloat();
                    p.setNotas(notas);
                    numNotas = numNotas+1;
                }
                System.out.println(p);
            }
        } finally {
            if (in != null) {
                in.close();
            }
        }
    }


}
