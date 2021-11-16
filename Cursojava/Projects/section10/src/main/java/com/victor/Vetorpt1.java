package com.victor;

import java.util.Scanner;

public class Vetorpt1 {
    //VETOR COM TIPOS PRIMITIVO
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            
            vect[i] = sc.nextDouble(); 

        }

        double sum = 0.0;
        for(int i=0; i<n; i++){
            sum += vect[i];
        }
        double avg = sum / n;
        System.out.println(String.format("A média do vetor é de: %.2f", avg));

    }

}
