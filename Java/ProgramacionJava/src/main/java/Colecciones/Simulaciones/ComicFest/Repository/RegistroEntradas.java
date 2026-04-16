package Colecciones.Simulaciones.ComicFest.Repository;

import Colecciones.Simulaciones.ComicFest.Models.*;

import java.time.LocalDate;
import java.util.*;

public class RegistroEntradas {
    Map<Influencer, EntradaVip> mapa;

    public RegistroEntradas() {
        this.mapa = new HashMap<>();
    }

    public void addEntrada(Influencer i){
        if (!mapa.containsKey(i)){
            EntradaVip e = new EntradaVip(1234, LocalDate.now(), TipoEntrada.GOLD);
            e.setEstado(EstadoEntrada.ENVIADA);
            mapa.put(i, e);
        }
        else {
            System.out.println("Este influencer ya tiene entrada");
        }
    }

    public EntradaVip buscarEntrada(String nick, String plataforma) {
        Influencer i = new Influencer("Pollasucia", nick, 1827, plataforma);
        EntradaVip entrada = mapa.get(i);
        return entrada;
    }

    public void confirmarAsistencia(String nick, String plataforma) {
        EntradaVip entrada = buscarEntrada(nick, plataforma);
        entrada.setEstado(EstadoEntrada.CONFIRMADA);
        System.out.println("Cambiando el estado de la entrada a confirmada...");
    }

    public void cancelarAsistencia(String nick, String plataforma) {
        EntradaVip entrada = buscarEntrada(nick, plataforma);
        entrada.setEstado(EstadoEntrada.CANCELADA);
        System.out.println("Cambiando el estado de la entrada a cancelada...");
    }

    public void mostrarConfirmados(){
        for (Influencer i : mapa.keySet()){
            if(mapa.get(i).getEstado() == EstadoEntrada.CONFIRMADA){
                System.out.println(i);
            }
        }
    }

    public void mostrarCancelados(){
        for (Influencer i : mapa.keySet()){
            if(mapa.get(i).getEstado() == EstadoEntrada.CANCELADA){
                System.out.println(i);
            }
        }
    }

    public void mostrarPendientes(){
        for (Influencer i : mapa.keySet()){
            if(mapa.get(i).getEstado() == EstadoEntrada.ENVIADA){
                System.out.println(i);
            }
        }
    }

    public void top3() {
        List<Influencer> lista = mapa.keySet();
        Collections.sort(lista, new ComparadorPorSeguidores());
        for (int i = 0; i < 2; i++){
            Influencer inf = lista.get(i);
            System.out.println(inf + " --> " + mapa.get(inf).getTipo());
        }
    }
}
