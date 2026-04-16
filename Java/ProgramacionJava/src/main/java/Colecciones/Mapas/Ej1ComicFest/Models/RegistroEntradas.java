package Colecciones.Mapas.Ej1ComicFest.Models;

import Colecciones.Mapas.Alumno;
import JavaOrientadoObjetos.BoletinAbstracto.FactoriaCoches.Models.Estado;

import java.util.*;

public class RegistroEntradas {
    private Map<Influencer, EntradaVip> mapa;

    public RegistroEntradas() {
        this.mapa = new HashMap<Influencer, EntradaVip>();
    }

    public void agregarEntrada(Influencer influencer, EntradaVip entrada){
        mapa.put(influencer, entrada);
        entrada.setEstado(EstadoEntrada.ENVIADA);
    }

    public EntradaVip buscarEntrada(String nick, String plataforma){
        Influencer i = new Influencer("ñlajkdf", nick, 17, plataforma);
        EntradaVip entrada = mapa.get(i);
        return entrada;
    }

    public void confirmarAsistencia(String nick, String plataforma){
        EntradaVip entrada = buscarEntrada(nick, plataforma);
        entrada.setEstado(EstadoEntrada.CONFIRMADA);
    }

    public void cancelarAsistencia(String nick, String plataforma){
        EntradaVip entrada = buscarEntrada(nick, plataforma);
        entrada.setEstado(EstadoEntrada.CANCELADA);
    }

    public Set<Influencer> influencersConfirmados(){
        Set<Map.Entry <Influencer, EntradaVip>> parejas = mapa.entrySet();

        Set<Influencer> influencersConfirmados = new HashSet<Influencer>();
        Iterator <Map.Entry<Influencer, EntradaVip>> it = parejas.iterator();

        while (it.hasNext()){
            Map.Entry <Influencer, EntradaVip> pareja = it.next();
            if (pareja.getValue().getEstado().equals(EstadoEntrada.CONFIRMADA)){
                influencersConfirmados.add(pareja.getKey());
            }
        }
        return influencersConfirmados;
    }
}
