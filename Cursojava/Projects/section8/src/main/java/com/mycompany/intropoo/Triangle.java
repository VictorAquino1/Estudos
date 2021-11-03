/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.intropoo;

/**
 *
 * @author victo
 */
public class Triangle {
    
    public double a;
    public double b;
    public double c;
    
    public double area() {
    Double p = (a+b+c)/2;
    return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    
}
