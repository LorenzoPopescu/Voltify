package com.example.voltify;

import java.util.Date;

public class Brano {
    private String titolo;
    private int durata;
    private String autore;
    private Date dataCreazione;

    public Brano(String titolo){
        this.titolo=titolo;
    }

    public String getTitolo(){
        return titolo;
    }
    public void setTitolo(String titolo){
        this.titolo=titolo;
    }

    public int getDurata(){
        return durata;
    }
    public void setDurata(int durata){
        this.durata=durata;
    }

    public String getAutore(){
        return autore;
    }
    public void setAutore(String autore){
        this.autore=autore;
    }

    public Date getDataCreazione(){
        return dataCreazione;
    }

    public void setDataCreazione(Date dataCreazione) {
        this.dataCreazione = dataCreazione;
    }

    public String toString(){
        return titolo;
    }
}
