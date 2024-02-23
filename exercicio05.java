/* 
 * 5. Crie um programa em Java que receba uma matriz de inteiros e verifique se ela é uma
    matriz diagonal (ou seja, se todos os elementos fora da diagonal principal são iguais a
    zero).
*/

public class exercicio05 {
    public static void main(String[] args) {
        int[][] matriz1 = {{4,0,0},{0,2,0},{0,0,1}};
        int[][] matriz2 = {{2,4,0},{0,1,7},{8,0,2}};

        //matriz1
        //exibe a matriz
        System.out.println("Matriz 1:");
        for(int x = 0; x < matriz1.length; x++) {
            System.out.print("[ ");
            for(int y = 0; y < matriz1[0].length; y++) {
                System.out.print(matriz1[x][y]+" ");
            }
            System.out.print("]\n");
        }

        //checa se a matriz é diagonal e exibe para o usuário
        System.out.println(checaMatrizDiagonal(matriz1));
        
        //matriz2
        //exibe a matriz
        System.out.println("Matriz 2:");
        for(int x = 0; x < matriz2.length; x++) {
            System.out.print("[ ");
            for(int y = 0; y < matriz2[0].length; y++) {
                System.out.print(matriz2[x][y]+" ");
            }
            System.out.print("]\n");
        }

        //checa se a matriz é diagonal e exibe para o usuário
        System.out.println(checaMatrizDiagonal(matriz2));
    }

    public static String checaMatrizDiagonal(int[][] matriz) {
        String res = "";

        //checa se a matriz é diagonal e exibe para o usuário
        for(int x = 0; x < matriz.length; x++) {
            for(int y = 0; y < matriz[0].length; y++) {
                if(x == y) {
                    if(matriz[x][y] != 0) {
                        break;
                    }

                    res += "A matriz não é diagonal!";
                }else{
                    if(matriz[x][y] == 0) {
                        break;
                    }

                    res += "A matriz não é diagonal!";
                }
            }
        }

        if(res.equals("")) {
            res = "A matriz é diagonal!";
        }

        return res;
    }
}