package Ficheros.Prueba1.Controllers;

import Ficheros.Prueba1.Utils.ManejaFicherocsvPersona;

import java.io.FileNotFoundException;

public class GestionacsvPersonas {
    static void main(String[] args){
        ManejaFicherocsvPersona csv = new ManejaFicherocsvPersona();
        try {
            csv.muestraContenidoFich("fichero1.txt");
        } catch (FileNotFoundException e) {
            System.out.println("No encuentro el fichero: " +e.toString());
        }
    }
}
