/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creación de arreglo bidimensionales
        Scanner entrada = new Scanner(System.in);

        // forma 1
        int valor;
        int[][] arreglo1 = new int[3][4]; //
        for (int f = 0; f < arreglo1.length; f++) {

            for (int c = 0; c < arreglo1[f].length; c++) {
                System.out.printf("ingrese el dato %d %d\n", f, c);
                valor = entrada.nextInt();
                if (valor >= 10 && valor % 2 == 0) {
                    arreglo1[f][c] = valor;
                }
            }
        }

        for (int fila = 0; fila < arreglo1.length; fila++) {
            for (int col = 0; col < arreglo1[fila].length; col++) {
                System.out.printf("fila[%d] columna[%d] = %d\n",
                        fila, col, arreglo1[fila][col]);
            }
        }

    }

}
