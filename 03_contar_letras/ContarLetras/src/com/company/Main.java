package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Escribe una frase");
        String texto = br.readLine().toUpperCase();

        String abc = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        int[] letras = contarLetras(texto, abc);

        visualizarRecuento(abc, letras);
    }

    public static int[] contarLetras(String texto, String abc){
        int[] letras = new int[27];
        for (int i = 0; i < texto.length(); i++) {
            for (int j = 0; j < abc.length(); j++) {
                if(texto.charAt(i) == abc.charAt(j)){
                    letras[j]++;
                }
            }
        }
        return letras;
    }

    public static void visualizarRecuento(String abc, int[] letras){
        for (int i = 0; i < letras.length; i++) {
            System.out.println(abc.charAt(i)+" "+letras[i]);
        }
    }
}
