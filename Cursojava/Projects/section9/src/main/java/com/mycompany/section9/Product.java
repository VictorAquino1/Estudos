/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.section9;

/**
 *
 * @author victo
 */
public class Product {
    private String name;
    private Double price;
    private Integer quantity;
    
    public Product(String name, Double price, Integer quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Double getPrice(){
    return price;
    }
    
    public void setPrice(Double price){
        this.price = price;
    }
    
    public Product(String name, Double price){
        this.name = name;
        this.price = price;
        
    }
    
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
