package com.cami.cat.camiurv;

/**
 * Created by Youssef on 13/02/2016.
 */
public class Peu {

    private String nom;
    private Ubicacio puntTrobada;
    private static int num;
    private String id;

    public Peu(String nom, Ubicacio puntTrobada){
        num++;
        this.nom=nom;
        this.puntTrobada=puntTrobada;
        id = num+nom;
    }

    public String getNom(){
        return nom;
    }

    public Ubicacio getPuntTrobada(){
        return puntTrobada;
    }

    public String getId(){return id;}
}
