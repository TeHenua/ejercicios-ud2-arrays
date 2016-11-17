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

        String busqueda;
        do{
            System.out.println("Escribe la primera letra para buscar o FIN");
            busqueda = br.readLine().toUpperCase();
            if(busqueda.equals("FIN")){
                System.out.println("AGUR");
            }else{
                char b = busqueda.charAt(0);
                buscar(lista,b);
            }
        }while (!busqueda.equals("FIN"));

    }

    public static void buscar(String[] lista, char b){
        for (int i = 0; i <lista.length ; i++) {
            if(lista[i].charAt(0) == b){
                System.out.println(lista[i]);
            }
        }
    }
}
