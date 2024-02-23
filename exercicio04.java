/* 
 * 4. Crie um programa em Java que receba um array de inteiros e um número inteiro k, e
    retorne um novo array contendo apenas os valores que aparecem no array original k
    vezes.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> array = new ArrayList<Integer>();
        String valor;

        //preenche o array principal
        do{
            System.out.println("Digite um número inteiro para acrescentar ao array(digite a letra S quando não desejar mais acrescentar valores ao array)");
            valor = sc.next();

            if(valor.equals("S") || valor.equals("s")){
                System.out.println("Array preenchido");
                System.out.println("Ficou assim:");
                System.out.print("[ ");
                for(int x = 0; x < array.size(); x++) {
                    System.out.print(array.get(x)+" ");
                }
                System.out.println("]");
                break;
            }
            
            array.add(Integer.parseInt(valor));

        }while(true);

        //pergunta ao usuário sobre a quantidade de vezes que o número se repete
        int k;

        System.out.println("Iremos criar um novo array com os números que se repetem X vezes no array principal");
        System.out.println("Esse array deve possuir apenas os números que se repetem quantas vezes?");
        k = Integer.parseInt(sc.next());
        
        //checa todos os itens do array principal, retorna os que repetem k vezes para o usuário
        System.out.println("\nO array novo ficou assim:");
        System.out.print("[ ");
        for(int i : criaNovoArrayComRepetidos(array, k)){
            System.out.print(i+" ");
        }
        System.out.println("]");

        sc.close();
    }

    public static ArrayList<Integer> criaNovoArrayComRepetidos(ArrayList<Integer> array, int k) {
        ArrayList<Integer> arrayNovo = new ArrayList<Integer>();
        
        for(int x = 0; x < array.size(); x++) {
            int repeticoes = 0;

            for(int y = 0; y < array.size(); y++) {
                if(array.get(x) == array.get(y)){
                    repeticoes++;
                }
            }

            if(repeticoes >= k && !arrayNovo.contains(array.get(x))) {
                arrayNovo.add(array.get(x));
            }
        }

        return arrayNovo;
    }
}