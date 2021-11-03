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
public class Product {
    public String name;
    public Double price;
    public Integer quantity;
    
    public Double totalValueInStock(){
        return price * quantity;
    }
    public void addProducts(int quantity){
        this.quantity += quantity;
    }
    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }
    
    public String toString(){
        return name+", $ "+ String.format("%.2f", price) + ", " + quantity + " units, Total: $"+ totalValueInStock();
    }
    
}
