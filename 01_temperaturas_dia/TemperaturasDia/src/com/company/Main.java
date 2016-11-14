package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        double[] temperaturas = new double[24];

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Introduce el valor para la hora "+i+":");
            temperaturas[i] = Double.parseDouble(br.readLine());
        }

        double media = calcularMedia(temperaturas);
        double min = calcularMin(temperaturas);
        double max = calcularMax(temperaturas);

        mostrarGrafica(temperaturas, media, max, min);

    }

    public static double calcularMedia(double[] t){
        double media = 0;
        for (int i = 0; i < t.length; i++) {
            media += t[i];
        }
        return media/t.length;
    }

    public static double calcularMax(double[] t){
        double max = Double.MIN_VALUE;
        for (int i = 0; i < t.length; i++) {
            if(t[i]>max){
                max = t[i];
            }
        }
        return max;
    }

    public static double calcularMin(double[] t){
        double min = Double.MAX_VALUE;
        for (int i = 0; i < t.length; i++) {
            if(t[i]<min){
                min = t[i];
            }
        }
        return min;
    }

    public static void mostrarGrafica(double[] t, double med, double max, double min){
        for (int i = 0; i < t.length; i++) {
            if(i<10){
                System.out.print(" ");
            }
            System.out.print(i+" ");
            for (int j = 0; j < (int)t[i]; j++) {
                System.out.print("*");
            }
            System.out.print(" "+t[i]);
            if(t[i]==max){
                System.out.print(" --> MAX");
            }else if(t[i]==min){
                System.out.print(" --> MIN");
            }
            System.out.print("\n");
        }

        System.out.println("Media: "+med);
    }
}
