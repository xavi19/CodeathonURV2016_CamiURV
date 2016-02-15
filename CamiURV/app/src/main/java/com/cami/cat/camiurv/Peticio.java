package com.cami.cat.camiurv;


/**
 * Created by Youssef on 13/02/2016.
 */
public class Peticio {

    private Cotxe cotxe;
    private int placesLliures;
    private int placesOcupades;
    private float preu;
    private Peu[] llistaPeu;

    public Peticio(Cotxe cotxe, int placesLlires, float preu){
        this.cotxe=cotxe;
        this.placesLliures =placesLlires;
        this.preu=preu;
        llistaPeu = new Peu[placesLlires];
        placesOcupades=0;
    }

    public Cotxe getCotxe() {
        return cotxe;
    }

    public int getPlacesLliures() {
        return placesLliures;
    }

    public int getPlacesOcupades() {
        return placesOcupades;
    }

    public float getPreu() {
        return preu;
    }

    /*public Peu[] getLlistaPeu() {
        return llistaPeu;
    }

    public void reservar(Peu peu) throws CotxePleException{
        if(placesOcupades==placesLliures) throw  new CotxePleException();
        else{
            llistaPeu[placesOcupades]=peu;
            placesOcupades++;
        }
    }

    public void cancelar(Peu peu) throws ReservaNotFoundException{

        int i=0;
        if(placesOcupades==0) throw new ReservaNotFoundException();
        else {
            while(i<placesOcupades&&!llistaPeu[i].getId().equals(peu.getId()))
                i++;
            if(i==placesOcupades) throw new ReservaNotFoundException();
            else{
                while(i<placesOcupades-1&&llistaPeu[i+1]!=null){
                    llistaPeu[i]=llistaPeu[i+1];
                }
                llistaPeu[placesOcupades-1]=null;
            }
        }
    }*/
}
