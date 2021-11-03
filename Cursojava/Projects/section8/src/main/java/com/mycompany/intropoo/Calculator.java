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
public class Calculator {
    public static final double PI = 3.14159;
    
    public static Double circumference(Double radius){
    return 2.0 * PI * radius;
    }
    
    public static Double volume(Double radius){
    return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
