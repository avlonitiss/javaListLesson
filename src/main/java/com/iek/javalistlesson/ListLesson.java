/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.iek.javalistlesson;

import java.util.Arrays;
import java.util.List;

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
    }
    
}
