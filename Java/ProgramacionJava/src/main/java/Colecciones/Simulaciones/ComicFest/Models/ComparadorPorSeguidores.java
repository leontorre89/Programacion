package Colecciones.Simulaciones.ComicFest.Models;

import java.util.Comparator;

public class ComparadorPorSeguidores implements Comparator<Influencer> {

    @Override
    public int compare(Influencer o1, Influencer o2) {
        return o1.getNumSeguidores() - o2.getNumSeguidores();
    }
}
