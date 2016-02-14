package com.cami.cat.camiurv;
import java.util.LinkedList;

/**
 * Created by Youssef on 13/02/2016.
 */
public class LlistaCotxes {

    private LinkedList<Cotxe> llista;

    public LlistaCotxes(){
        llista = new LinkedList<Cotxe>();
    }

    public void afegirCotxe(Cotxe cotxe){
        llista.add(cotxe);
    }

    public void eliminarCotxe(Cotxe cotxe) {
        if(!llista.remove(cotxe)) ;
    }

    public LinkedList<Cotxe> getLlista(){
        return llista;
    }

}
