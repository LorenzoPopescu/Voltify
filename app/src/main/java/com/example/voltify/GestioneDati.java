package com.example.voltify;
import java.util.ArrayList;


public class GestioneDati{
    ArrayList<Brano> ListaBrani;

    public GestioneDati(){
        ListaBrani = new ArrayList<Brano>();
    }

    public void addBrani(String titolo, String genere, int durata, String dataCreazione, String regista){
        Brano br = new Brano(titolo,genere,durata,dataCreazione,regista);
        ListaBrani.add(br);
    }

    public void listaBrani(){
        StringBuilder stBui = new StringBuilder();
        for(Brano brV : ListaBrani){
            stBui.append(brV.toString());
            System.out.println(ListaBrani);
        }
    }

    public StringBuilder vediLista(){
        StringBuilder stBui = new StringBuilder();
        for (Brano brV : ListaBrani){
            stBui.append(brV.toString());
        }
        return stBui;
    }

}
