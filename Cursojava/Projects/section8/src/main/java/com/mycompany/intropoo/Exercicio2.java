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
public class Exercicio2 {
    public static final double PI = 3.14159;
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter radius: ");
        Double radius = sc.nextDouble();
        
        Double c = circumference(radius);
        Double v = volume(radius);
        System.out.println(String.format("Circumference: %.2f%n", c));
        System.out.println(String.format("Volume: %.2f%n", v));
        System.out.println(String.format("PI: %.2f%n", PI));
        
        
    }
    public static Double circumference(Double radius){
    return 2.0 * PI * radius;
    }
    public static Double volume(Double radius){
    return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
