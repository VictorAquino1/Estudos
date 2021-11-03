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
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product product = new Product();
        
        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        product.name = sc.nextLine();
        System.out.println("Price: ");
        product.price = sc.nextDouble();
        System.out.println("Quantity in stock: ");
        product.quantity = sc.nextInt();
        
        System.out.println();
        System.out.println("Product data: "+ product);
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity  = sc.nextInt();
        product.addProducts(quantity);
        System.out.println("Updated data: "+ product);
        
        System.out.println("Enter the number of products to be removed in stock: ");
        quantity  = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println();
        System.out.println("Updated data: "+ product);
        
    }
   
    
}
