package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        String[] lista = new String[5];

        for (int i = 0; i < lista.length; i++) {
            System.out.println("Escribe el nombre y apellidos");
            lista[i] = br.readLine().toUpperCase();
        }

        String b;
        do{
            System.out.println("Escribe la primera letra para buscar o FIN");
            b = br.readLine().toUpperCase();
            if(b.equals("FIN")){
                System.out.println("AGUR");
            }else{
                System.out.println(buscar(lista));
            }
        }while (!b.equals("FIN"));

    }

    public static String buscar(String[] lista){

        return "";
    }
}
