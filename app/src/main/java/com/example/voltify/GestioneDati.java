package com.example.voltify;

import java.util.ArrayList;

public class GestioneDati{
    ArrayList<Brano> ListaBrani;

    public GestioneDati(){
        ListaBrani = new ArrayList<Brano>();
    }

    public void addBrani(String titolo){
        Brano br = new Brano(titolo);
        ListaBrani.add(br);
    }

    public void listaBrani(){
        StringBuilder stBui = new StringBuilder();
        for(Brano brV : ListaBrani){
            stBui.append(brV.toString());
        }
    }

}
