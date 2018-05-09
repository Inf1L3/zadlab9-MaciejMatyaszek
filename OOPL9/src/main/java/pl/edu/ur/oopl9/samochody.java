/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

import java.util.ArrayList;

/**
 *
 * @author student
 */
public class samochody {
    private String marka;
    private String nazwa;
    private int predkoscmax;
    private double cena;

    public samochody(String marka, String nazwa, int predkoscmax, double cena) {
        this.marka = marka;
        this.nazwa = nazwa;
        this.predkoscmax = predkoscmax;
        this.cena = cena;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getPredkoscmax() {
        return predkoscmax;
    }

    public void setPredkoscmax(int predkoscmax) {
        this.predkoscmax = predkoscmax;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "samochody{" + "marka=" + marka + ", nazwa=" + nazwa + ", predkoscmax=" + predkoscmax + ", cena=" + cena + '}';
    }
public static void main(String[] args) {
    ArrayList<Object> lista = new ArrayList<Object>();
    samochody s1= new samochody("audi", "a6", 280, 200000);
    samochody s2= new samochody("BMW", "asasf", 260, 150000);
    samochody s3= new samochody("Reno", "Scenic", 260, 100000);
    lista.add(s1);
    lista.add(s2);
    lista.add(s3);
    for (int i = 0; i < lista.size(); i++) {
            System.out.println("ArrayList Element " + i + " :" + lista.get(i));
        }
}
}
