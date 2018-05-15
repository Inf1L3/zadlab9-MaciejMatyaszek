/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

import java.util.HashMap;
import java.util.Scanner;



/**
 *
 * @author maarchyl
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Liczby liczby = new Liczby();
        liczby.sortuj();
        liczby.wypisz();
        // TODO code application logic here
        zad2.zad2();
        
        //zad4
 Scanner input = new Scanner(System.in);
            
            HashMap<String, String> słownik = new HashMap<>(20);
           Słownik s1 = new Słownik();
           
           s1.setMap(słownik);
           String a = " ";
           while(!a.equals("koniec"))
           {
               
               System.out.println("Wpisz koniec, aby zakończyć działanie programu");
               a = input.nextLine();
               
              if(!słownik.containsKey(a))
              {
                  System.out.println("Błąd! Złe słowo");
              }
              else
                   System.out.println(słownik.get(a));
               
           } 
    
}}
