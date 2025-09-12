/*Exercício 5: Busca de Elemento em um Array
Descrição:
Implemente um programa que solicite ao usuário 10 números inteiros e os
armazene em um array. Em seguida, o usuário deve digitar um número para buscar
no array. O programa deve informar se o número está presente e em qual posição.
Requisitos:
• Criar um array de tamanho 10.
• Solicitar um número ao usuário e verificar se ele está presente no array.
• Se o número for encontrado, exibir sua posição. Caso contrário, exibir
"Número não encontrado.".*/

package Exercicio05;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int[] numeros = new int[10];
	    System.out.println("Insira os numeros que deseja inserir no Array: ");
	    for(int i =0;i<numeros.length;i++){
	        System.out.print("Numero "+(i+1)+" :");
	        numeros[i] = scanner.nextInt();
	    }
	    System.out.print("Insira o numero que deseja ser buscado no Array: ");
	     int buscarNumero = scanner.nextInt();
	     boolean encontrado = false;
	    for(int i =0;i<numeros.length;i++){
	        if(buscarNumero == numeros[i]){
	            System.out.println("Numero " +buscarNumero + " encontrado na posição "+i+" !");
	            encontrado = true;
	            break;
	        }
	    }
	    if(!encontrado){
	        System.out.println("Numero não encontrado dentro do Array!");
	    }
		scanner.close();
	}
}
