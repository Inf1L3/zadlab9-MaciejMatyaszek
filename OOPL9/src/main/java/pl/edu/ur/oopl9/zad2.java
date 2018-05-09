/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

/**
 *
 * @author student
 */
public class zad2 {
    public static void zad2(){
    Random losuj=new Random();
    TreeSet<Integer> set= new TreeSet<Integer>();
    for (int i = 0; i <100; i++){
        set.add(losuj.nextInt());
    
}
    Iterator iter = set.iterator();
    while (iter.hasNext()){
        Integer liczba= (Integer) iter.next();
        System.out.println(liczba);
    }
    }
    
    
}

