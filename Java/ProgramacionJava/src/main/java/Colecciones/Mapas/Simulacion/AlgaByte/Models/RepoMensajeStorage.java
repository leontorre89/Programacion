package Colecciones.Mapas.Simulacion.AlgaByte.Models;

import java.util.*;

public class RepoMensajeStorage {
    Map<Usuario, List<Mensaje>> mapa;

    public RepoMensajeStorage() {
        this.mapa = new TreeMap<>();
    }


}
