/* 
 * 2. Crie um programa em Java que implemente a união de dois arrays. O programa deve
    receber dados para preencher dois arrays de inteiros e criar um novo array contendo a
    união de v1 e v2. Por exemplo, se v1 = {11, 13, 45, 7} e v2 = {24, 4, 16, 81, 10, 12}, v3 irá
    conter {11, 13, 45, 7, 24, 4, 16, 81, 10, 12}.
*/

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        //primeiro array
        int numeroV1;
        System.out.println("Array 1:");
        System.out.println("Quantos dados esse array deverá armazenar?");
        numeroV1 = Integer.parseInt(sc.next());

        int[] v1 = new int[numeroV1];

        for(int x = 0; x < v1.length; x++) {
            System.out.println("Qual número deseja armazenar na "+(x+1)+"ª casa do array V1?");
            v1[x] = Integer.parseInt(sc.next());
        }
        
        //segundo array
        int numeroV2;
        System.out.println("Array 2:");
        System.out.println("Quantos dados esse array deverá armazenar?");
        numeroV2 = Integer.parseInt(sc.next());

        int[] v2 = new int[numeroV2];

        for(int x = 0; x < v2.length; x++) {
            System.out.println("Qual número deseja armazenar na "+(x+1)+"ª casa do array V2?");
            v2[x] = Integer.parseInt(sc.next());
        }

        //União dos arrays
        unirArrays(v1, v2);
        sc.close();
    }

    public static void unirArrays(int[] v1, int[] v2) {
        int[] arrayUnido = new int[v1.length+v2.length];
        int casaArray = 0;

        for(int x = 0; x < v1.length; x++){
            arrayUnido[casaArray] = v1[x];
            casaArray++;
        }

        for(int x = 0; x < v2.length; x++) {
            arrayUnido[casaArray] = v2[x];
            casaArray++;
        }

        System.out.println("Os arrays V1 e V2 unidos ficaram:");
        System.out.print("[");
        for(int x = 0; x < arrayUnido.length; x++) {
            System.out.print(" "+arrayUnido[x]);
        }
        System.out.print("]");
    }
}