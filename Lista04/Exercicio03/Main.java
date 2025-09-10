/* Exercício 3: Inversão de Elementos de um Array
Descrição:
Escreva um programa que solicite ao usuário 6 números inteiros e os armazene
em um array. Em seguida, exiba os números na ordem inversa à de entrada.
Requisitos:
• Criar um array de tamanho 6.
• Utilizar um loop for para preencher o array.
• Utilizar outro loop for para exibir os elementos na ordem inversa.*/

package Exercicio03;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int[] numeros = new int[6];
	    System.out.println("Insira os "+numeros.length + " numeros: ");
	    for(int i = 0;i < numeros.length;i++){
	    System.out.print("Numero "+ (i+1) + ": ");
	    numeros[i] = scanner.nextInt();
	    }
	    System.out.print("Array invertido: ");
	    for(int i = numeros.length - 1; i >= 0;i--)
	    System.out.print(+numeros[i] +" ");
	    scanner.close();
    }
}
