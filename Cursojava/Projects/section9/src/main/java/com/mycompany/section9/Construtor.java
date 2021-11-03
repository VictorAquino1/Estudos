/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.section9;

import java.util.Scanner;

/**
 *
 * @author victo
 */
public class Construtor {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Price: ");
        Double price = sc.nextDouble();
        Product product = new Product(name, price);
        
        product.setName("Computer");
        System.out.println("Updated name: " +product.getName());
        product.setPrice(1200.00);
        System.out.println("Updated price: " +product.getPrice());
        
         
         
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
