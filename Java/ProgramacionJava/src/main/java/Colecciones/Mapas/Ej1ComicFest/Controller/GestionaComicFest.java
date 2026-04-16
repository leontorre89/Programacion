package Colecciones.Mapas.Ej1ComicFest.Controller;

import Colecciones.Mapas.Ej1ComicFest.Models.*;

import java.time.LocalDate;
import java.util.Set;

public class GestionaComicFest {
    static void main(String[] args) {
        Influencer i1 = new Influencer("Adrian", "Leontorre", 783, "Steam");
        Influencer i2 = new Influencer("Jose", "JoseOrdenador", 1294, "Xbox");
        Influencer i3 = new Influencer("Carlos", "Brais", 1438, "Steam");

        EntradaVip e1 = new EntradaVip("1233", LocalDate.now(), TipoEntrada.GOLD, EstadoEntrada.CONFIRMADA);
        EntradaVip e2 = new EntradaVip("12984", LocalDate.now(), TipoEntrada.PLATINUM, EstadoEntrada.CONFIRMADA);
        EntradaVip e3 = new EntradaVip("7364", LocalDate.now(), TipoEntrada.SILVER, EstadoEntrada.ENVIADA);

        RegistroEntradas r = new RegistroEntradas();
        r.agregarEntrada(i1, e1);
        r.agregarEntrada(i2, e2);
        r.agregarEntrada(i3, e3);

        r.confirmarAsistencia("Leontorre", "Steam");
        r.confirmarAsistencia("JoseOrdenador", "Xbox");

        System.out.println(r.influencersConfirmados());
    }
}
