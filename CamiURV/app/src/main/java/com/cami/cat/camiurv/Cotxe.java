package com.cami.cat.camiurv;

/**
 * Created by Youssef on 13/02/2016.
 */
public class Cotxe {
    private String id;
    private static int num;
    private String nom;
    private int numPlaces;
    private String marca;
    private String modelo;
    private String matricula;
    private String color;
    private Ubicacio sortidaHabitual;
    private float tarifaMinima;
    private int codiPostal;

    /**Constructor de classe cotxe
     *
     * @param nom
     * @param numPlaces
     * @param marca
     * @param modelo
     * @param matricula
     * @param color
     * @param sortidaHabitual
     * @param codiPostal
     */
    public Cotxe(String nom, String marca, String modelo, String matricula, String color,int numPlaces, Ubicacio sortidaHabitual,
                 int codiPostal){
        num++;
        this.id=num+nom;
        this.nom=nom;
        this.numPlaces=numPlaces;
        this.modelo=modelo;
        this.matricula=matricula;
        this.color=color;
        this.sortidaHabitual=sortidaHabitual;
        this.codiPostal=codiPostal;
    }

    public String getId(){
        return id;
    }
    public int getNumPlaces() {
        return numPlaces;
    }

    public String getNom() {
        return nom;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getColor() {
        return color;
    }

    public Ubicacio getSortidaHabitual() {
        return sortidaHabitual;
    }

    public float getTarifaMinima() {
        return tarifaMinima;
    }

    public void setTarifaMinima(float tarifaMinima){
        this.tarifaMinima=tarifaMinima;
    }

    public int getCodiPostal() {
        return codiPostal;
    }



}
