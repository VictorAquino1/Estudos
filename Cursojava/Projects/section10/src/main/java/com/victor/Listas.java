package com.victor;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

public class Listas {

     public static void main(String[] args) {
        List<String>  list = new ArrayList<String>();
    
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Josef");

        for (String x : list){
            System.out.println(x);
        }

        System.out.println("---------");
        
    
        


     }
   
    
    
}
