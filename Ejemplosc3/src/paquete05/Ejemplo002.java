/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

/**
 *
 * @author reroes
 */
public class Ejemplo002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creación de arreglo bidimensionales
        
        int[][] arreglo1 = {{10, 41, 40}, {1, 2, 3},{1, 12, 4}};
        /*
              
        10      41      40
        1       2       3
        1       12      4
        */
        int suma = 0;
        int valor;
        for (int fila = 0; fila < arreglo1.length; fila++) {
            for (int col = 0; col < arreglo1[fila].length; col++) {
                valor = arreglo1[fila][col];
                /* se colocò como condicional del if que el valor que tiene 
                la variable fila debe ser igual al valor que tiene la variable 
                col debido a que los valores que se deben sumar sus posisciones 
                de filas y columnas son iguales 
                (00)  01   02
                 10  (11)  12
                 20   21  (22)*/
                if (fila==col){
                    suma = suma + valor;
                }
                
            }
        }
        System.out.printf("Suma de valores del arreglo: %d\n", suma);
    }
    
}
