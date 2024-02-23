/* 
 * 3. Crie um programa em Java que receba uma matriz quadrada de inteiros e retorne a
    soma dos valores da diagonal principal da matriz.
*/

import java.util.Scanner;

public class exercicio03 {
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

        System.out.println("A soma da diagonal principal da matriz é igual a: " + somaDiagonalPrincipal(matriz));
        sc.close();
    }

    public static int somaDiagonalPrincipal(int[][] matriz) {
        int soma = 0;
        for(int x = 0; x < matriz.length; x++) {
            soma += matriz[x][x];
        }

        return soma;
    }
}