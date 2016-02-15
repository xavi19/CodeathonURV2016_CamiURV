package com.cami.cat.camiurv;
import java.util.LinkedList;

/**
 * Created by Youssef on 13/02/2016.
 */
public class LlistaPeu {

    private LinkedList<Peu> llista;

    public LlistaPeu(){
        llista= new LinkedList<Peu>();
    }

    public void afegirPeu(Peu peu){
        llista.add(peu);
    }

    /*public void eliminarPeu(Peu peu) throws PeuNotFoundException{
        if(!llista.remove(peu)) throw new PeuNotFoundException();
    }*/

    public LinkedList<Peu> getLlista(){
        return llista;
    }
}
