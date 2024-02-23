/* 
 * 1.Escreva um programa em Java que leia uma matriz de inteiros de tamanho NxM (onde N
    e M são definidos pelo usuário) e retorne a posição (linha e coluna) do maior valor
    armazenado na matriz.
*/

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int linhas;
        int colunas;
        
        System.out.println("Quantas linhas a Matriz deve possuir?");
        linhas = Integer.parseInt(sc.next());

        System.out.println("Quantas colunas a Matriz deve possuir?");
        colunas = Integer.parseInt(sc.next());

        int[][] matriz = new int[linhas][colunas];

        int casas = 1;

        //preenche a matriz
        System.out.println("Agora preencha a matriz com números inteiros");
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


        System.out.println(checarPosicaoMaiorValor(matriz));

        sc.close();
    }

    public static String checarPosicaoMaiorValor(int[][] matriz) {
        int casas = 1;
        int maior = 0;
        int maiorCasa = 0;

        for(int x = 0; x < matriz.length; x++) {
            for(int y = 0; y < matriz[0].length; y++) {
                if(x == 0 && y == 0){
                    maior = matriz[x][y];
                    maiorCasa = casas;
                }else if(matriz[x][y] > maior) {
                    maior = matriz[x][y];
                    maiorCasa = casas;
                }

                casas++;
            }
        }

        return "O maior número armazenado na matriz é: "+maior+"\n"+
        "E ele está armazenado na "+maiorCasa+"ª posição";
    }
}