/* Exercício 1: Maior e Menor Valor em um Array
Descrição:
Crie um programa que solicite ao usuário 5 números inteiros e armazene-os em
um array. Após isso, o programa deve exibir o maior e o menor número do array.
Requisitos:
• Criar um array de tamanho 5.
• Utilizar um loop for para percorrer o array e encontrar o maior e o menor
valor.
• Exibir o maior e o menor número armazenados no array.*/

package Exercicio01;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int[] numeros = new int[5];
	    System.out.println("Insira os 5 numeros: ");
	    for(int i = 0;i < numeros.length;i++){
	    System.out.print("Numero "+ (i+1) + ": ");
	    numeros[i] = scanner.nextInt();
	    }
	    int maior = numeros[0];
	    int menor = numeros[0];
	    for(int i = 1; i< numeros.length;i++){
	        if(numeros[i] > maior){
	            maior = numeros[i];
	        }
	        if(numeros[i] < menor){
	            menor = numeros[i];
	        }
	    }
	    System.out.println("Maior numero: "+maior);
	    System.out.println("Menor numero: "+menor);
	    scanner.close();
    }
}
