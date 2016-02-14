package com.cami.cat.camiurv;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.LinkedList;



/**
 * Created by Youssef on 13/02/2016.
 */
public class LlistaPeticions {

    private LinkedList<Peticio> llista;

    public LlistaPeticions() {
        llista = new LinkedList<Peticio>();
    }

    public void afegirPeticio(Peticio peticio) {
        llista.add(peticio);
    }

    public void eliminarPeticio(Peticio peticio){
        if (!llista.remove(peticio)) ;
    }

    public LinkedList<Peticio> getLlista() {
        return llista;
    }

    public LinkedList<Peticio> getLlistaFiltrada(Peu peu) {
        LinkedList<Peticio> aux = new LinkedList<Peticio>();

        for (int i = 0; i < llista.size(); i++) {
            if (distanciaCotxe(llista.get(i), peu) <= 1)
                aux.add(llista.get(i));
        }

        return aux;
    }

    public float distanciaCotxe(Peticio peticio, Peu peu){
        return 0;
    }
}