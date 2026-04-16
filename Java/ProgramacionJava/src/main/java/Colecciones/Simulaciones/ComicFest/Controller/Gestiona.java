package Colecciones.Simulaciones.ComicFest.Controller;

import Colecciones.Simulaciones.ComicFest.Models.EntradaVip;
import Colecciones.Simulaciones.ComicFest.Models.Influencer;
import Colecciones.Simulaciones.ComicFest.Repository.RegistroEntradas;

public class Gestiona {
    static void main(String[] args) {
        RegistroEntradas r = new RegistroEntradas();
        Influencer i = new Influencer("Leon", "Leontorre", 1789, "TikTok");
        r.addEntrada(i);
        EntradaVip entrada = r.buscarEntrada("Leontorre", "TikTok");
        System.out.println(entrada);
    }
}
