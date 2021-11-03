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
public class Exercicio2Pt2 {
    
        public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter radius: ");
        Double radius = sc.nextDouble();
        
        Double c = Calculator.circumference(radius);
        Double v = Calculator.volume(radius);
        
        System.out.println(String.format("Circumference: %.2f%n", c));
        System.out.println(String.format("Volume: %.2f%n", v));
        System.out.println(String.format("PI: %.2f%n", Calculator.PI));
        
        
    }
}
