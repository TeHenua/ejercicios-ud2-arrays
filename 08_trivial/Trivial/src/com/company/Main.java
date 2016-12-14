package com.company;

import java.io.IOException;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {

        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        String[] p = new String[5];
        String[] r = new String[5];

        p[0] = "¿En que calle vive Sherlock Holmes?";
        r[0] = "Baker Street";
        p[1] = "¿?";
        r[1] = "";
        p[2] = "¿?";
        r[2] = "";
        p[3] = "¿?";
        r[3] = "";
        p[4] = "¿?";
        r[4] = "";
        System.out.println("Bienvenido");
        int contador = 0;
        int a;
        String salir;
        do{
            Random md = new Random();
            a = md.nextInt(p.length);
            System.out.print("Pregunta: ");
            System.out.println(p[a]);
            System.out.println("(Pulsa enter para ver la respuesta)");
            br.readLine();

            System.out.println("Respuesta:");
            System.out.println(r[a]);

            System.out.println("¿Has acertado?");
            String acierto = br.readLine();
            if (acierto.equalsIgnoreCase("si")){
                contador++;
            }
            System.out.println("Quieres continuar?");
            salir = br.readLine();
        }while (salir.equalsIgnoreCase("si") && contador<5);

        if(contador==5){
            System.out.println("Has ganado");
        }
        System.out.println("Agur!");
    }
}
