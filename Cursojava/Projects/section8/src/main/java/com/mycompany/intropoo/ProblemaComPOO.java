/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.intropoo;

import java.util.Scanner;

/**
 *
 * @author victo
 */
public class ProblemaComPOO {
      public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Triangle x,y;
        x = new Triangle();
        y = new Triangle();
        
        
        System.out.println("Enter the measures of triangle X: ");
        x.a = leitor.nextDouble();
        x.b = leitor.nextDouble();
        x.c = leitor.nextDouble();
        
        System.out.println("Enter the measures of triangle Y: ");
        y.a = leitor.nextDouble();
        y.b = leitor.nextDouble();
        y.c = leitor.nextDouble();
        
       
        
        
        Double areaX = x.area();
        Double areaY = y.area();
        
        System.out.println(String.format("Larger area: %.4f", areaX));
        System.out.println(String.format("Larger area: %.4f", areaY));
        
        if(areaX > areaY){
            System.out.println("Larger area: X");
        } else {
            System.out.println("larger area: Y");
        }
        
      }
}
