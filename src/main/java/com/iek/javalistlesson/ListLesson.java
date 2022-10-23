/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.iek.javalistlesson;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Spyros
 */
public class ListLesson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> countries = Arrays.asList("Germany", "Panama", "Australia");
        
        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.get(i));
        }
        
        /* Enhanced Loop Function
        
      
        */
        
        for (String country : countries) {
            System.out.println(country); 
        }
        
        
        /*
        Iterator
        */
        
        Iterator<String> countriesIterator = countries.iterator();

            while(countriesIterator.hasNext()) {
                System.out.println(countriesIterator.next()); 
            }
            
            
        /*
            ListIterator
            */
        ListIterator<String> listIterator = countries.listIterator();

            while(listIterator.hasNext()) {
                System.out.println(listIterator.next());
            }
            
        
            /*
            Backward ListIterator
            */
            
        ListIterator backwardIterator;
            backwardIterator=countries.listIterator(countries.size());

            while (backwardIterator.hasPrevious()) {
                System.out.println(backwardIterator.previous());
            }
        
       
            /*
            Reverse FOR
            */
            
        for (int i = countries.size(); i-- > 0; ) {
            System.out.println(countries.get(i));
            }
        
        
        /*
        forEACH
        */
        
        countries.forEach(System.out::println);
    }
    
}
