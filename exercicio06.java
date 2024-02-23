/* 
 * 6. Crie um programa em Java que receba uma matriz de inteiros e retorne um novo array
    contendo os elementos na diagonal secundária da matriz (ou seja, a diagonal que vai do
    canto superior direito ao canto inferior esquerdo).
*/

import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int linhasColunas;

        System.out.println("Quantas linhas e colunas a matriz deve possuir?");
        linhasColunas = Integer.parseInt(sc.next());

        int[][] matriz = new int[linhasColunas][linhasColunas];
        int casas = 1;

        //preenche a matriz
        System.out.println("Agora preencha a matriz:");
        for(int x = 0; x < matriz.length; x++) {
            for(int y = 0; y < matriz[0].length; y++) {
                System.out.println("Qual número deseja armazenar na "+casas+"ª da matriz?");
                matriz[x][y] = Integer.parseInt(sc.next());
                casas++;
            }
        }

        //exibe a matriz
        System.out.println("A matriz ficou assim:");
        for(int x = 0; x < matriz.length; x++) {
            System.out.print("[ ");
            for(int y = 0; y < matriz[0].length; y++) {
                System.out.print(matriz[x][y]+" ");
            }
            System.out.print("]\n");
        }
        
        //Cria array da diagonal secundária
        int[] array = new int[linhasColunas];
        int y = linhasColunas-1;
        for(int x = 0; x < array.length; x++) {
            array[x] = matriz[x][y];
            y--;
        };

        //exibe a diagonal secundária
        System.out.println("\nOs números da diagonal secundária da matriz foram:");
        System.out.print("[ ");
        for(int x = 0; x < array.length; x++) {
            System.out.print(array[x] + " ");
        }
        System.out.print("]");
        sc.close();
    }
}