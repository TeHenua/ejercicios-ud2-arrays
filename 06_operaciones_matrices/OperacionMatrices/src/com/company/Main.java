package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {

        int[][] m1 = new int[4][4];
        int[][] m2 = new int[4][4];

        Random r = new Random();

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                m1[i][j] = r.nextInt(10);
                m2[i][j] = r.nextInt(10);
            }
        }

        System.out.println("M1:");
        visualizarMatriz(m1);
        System.out.println("M2:");
        visualizarMatriz(m2);
        System.out.println("Suma de matrices:");
        visualizarMatriz(sumar(m1,m2));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce un valor");
        int n = Integer.parseInt(br.readLine());
        System.out.println("Producto por un escalar:");
        visualizarMatriz(escalar(m1,n));
        System.out.println("Producto de dos matrices:");
        visualizarMatriz(multiplicar(m1,m2));
        System.out.println("Matriz traspuesta:");
        visualizarMatriz(traspuesta(m2));
    }

    public static void visualizarMatriz(int[][] m){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.format("%3d", m[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] sumar(int[][] m1, int[][] m2){
        int[][] r = new int[m1.length][m1[0].length];
        for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < r[0].length; j++) {
                r[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return r;
    }

    public static int[][] escalar(int[][] m, int e) throws IOException {
        int[][] r = new int[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                r[i][j] = m[i][j] * e;
            } 
        }
        return r;
    }

    public static int[][] multiplicar(int[][] m1, int[][] m2){
        int[][] r = new int[m1.length][m1[0].length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                for (int k = 0; k < m1.length; k++) {
                    r[i][j] += m1[i][k] + m2[k][j];
                }
            }
        }
        return r;
    }

    public static int[][] traspuesta(int[][] m){
        int[][] r = new int[m[0].length][m.length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                r[j][i] = m[i][j];
            }
        }
        return r;
    }
}
