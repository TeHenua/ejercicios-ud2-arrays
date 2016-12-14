package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        int[][] t = new int[9][9];
        t[0][0] = 5;
        t[0][1] = 3;
        t[0][4] = 7;
        t[1][0] = 6;
        t[1][3] = 1;
        t[1][4] = 9;
        t[1][5] = 5;
        t[2][1] = 9;
        t[2][2] = 8;
        t[2][7] = 6;
        t[3][0] = 8;
        t[3][4] = 6;
        t[3][8] = 3;
        t[4][0] = 4;
        t[4][3] = 8;
        t[4][5] = 3;
        t[4][8] = 1;
        t[5][0] = 7;
        t[5][4] = 2;
        t[5][8] = 6;
        t[6][1] = 6;
        t[6][6] = 2;
        t[6][7] = 8;
        t[7][3] = 4;
        t[7][4] = 1;
        t[7][4] = 1;
        t[7][8] = 5;
        t[8][4] = 8;
        t[8][7] = 7;

        mostrarTablero(t);

        int fila;
        int col;
        int n;
        String men = "Número erróneo";
        String continuar;
        boolean error = false;
        boolean lleno = false;
        do{
            System.out.print("Fila: ");
            fila = Integer.parseInt(br.readLine());
            System.out.print("Columna: ");
            col = Integer.parseInt(br.readLine());
            System.out.print("Número: ");
            n = Integer.parseInt(br.readLine());
            if(t[fila][col] == 0){
                for (int i = 0; i < t.length; i++) {
                   if(t[fila][i] == n ){
                       error = true;
                   }else if(t[i][col] == n){
                       error = true;
                   }
                }
                if(!miniCorrecto(t,col,fila,n)){
                    error = true;
                }
                if (!error){
                    t[fila][col] = n;
                }else {
                    System.out.println(men);
                }
            }else{
                System.out.println("Ya existe un valor en esa posición");
            }

            lleno = comprobarLleno(t);
            System.out.println("¿Quieres continuar?");
            continuar = br.readLine();
            if(continuar.equalsIgnoreCase("si")){
                mostrarTablero(t);
            }
        }while (continuar.equalsIgnoreCase("si") && !lleno);
    }

    public static boolean comprobarLleno(int[][] t){
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length; j++) {
                if (t[i][j] == 0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void mostrarTablero(int[][] t){
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length; j++) {
                System.out.format("%5d ", t[i][j]);
            }
            System.out.println();
        }
    }
    public static boolean miniCorrecto(int[][] t, int col, int fila, int n){
        int col3 = (col+1)/3;
        int fila3 = (fila+1)/3;

        if(col3<=1){
            col = 2;
        }else if(col3<2){
            col=5;
        }else{
            col=8;
        }
        if(fila3<=1){
            fila = 2;
        }else if(fila3<2){
            fila=5;
        }else{
            fila=8;
        }
        for (int i = (fila-2); i < fila; i++) {
            for (int j = (col-2); j < col; j++) {
                if(t[fila][col]==n){
                    return false;
                }
            }
        }
        return true;
    }
}
