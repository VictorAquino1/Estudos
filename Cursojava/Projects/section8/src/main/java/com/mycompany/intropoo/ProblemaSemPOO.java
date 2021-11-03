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
public class ProblemaSemPOO {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Enter the measures of triangle X: ");
        Double medidaX1 = leitor.nextDouble();
        Double medidaX2 = leitor.nextDouble();
        Double medidaX3 = leitor.nextDouble();
        
        System.out.println("Enter the measures of triangle Y: ");
        Double medidaY1 = leitor.nextDouble();
        Double medidaY2 = leitor.nextDouble();
        Double medidaY3 = leitor.nextDouble();
        
        Double Xp = (medidaX1+medidaX2+medidaX3)/2;
        Double Yp = (medidaY1+medidaY2+medidaY3)/2;
        
        
        Double areaX = Math.sqrt(Xp*(Xp-medidaX1)*(Xp-medidaX2)*(Xp-medidaX3));
        Double areaY = Math.sqrt(Yp*(Yp-medidaY1)*(Yp-medidaY2)*(Yp-medidaY3));
        
        System.out.println(String.format("Larger area: %.4f", areaX));
        System.out.println(String.format("Larger area: %.4f", areaY));
        
        if(areaX > areaY){
            System.out.println("Larger area: X");
        } else {
            System.out.println("larger area: Y");
        }
        
        
    }
}
