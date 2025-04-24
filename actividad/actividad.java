/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad;

/**
 *
 * @author Biblioteca
 */
public class actividad {
    public static void main(String[] args) {
        // Definir la matriz 4x4
        int[][] matriz = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        // Imprimir la matriz
        System.out.println("matriz:");
        for (int i = 0; i < 4; i++) { // 4 filas
            for (int j = 0; j < 4; j++) { // 4 columnas
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Salto de línea después de cada fila
        }

        // Imprimir la diagonal principal
        System.out.print("\ndiagonal principal: ");
        for (int i = 0; i < 4; i++) {
            System.out.print(matriz[i][i] + " ");  // [i][i] es la diagonal principal
        }

        // Imprimir la diagonal secundaria
        System.out.print("\ndiagonal secundaria: ");
        for (int i = 0; i < 4; i++) {
            System.out.print(matriz[i][3 - i] + " ");  // [i][3-i] es la diagonal secundaria
        }
    }
}
