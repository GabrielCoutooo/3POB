/*Exercício 4: Contagem de Ocorrências de um Número
Descrição:
Desenvolva um programa que solicite ao usuário inserir 10 números inteiros em
um ArrayList<Integer>. Depois, peça ao usuário para digitar um número e informe
quantas vezes esse número aparece na lista.
Requisitos:
• Criar um ArrayList<Integer> para armazenar os números.
• Utilizar um loop for para contar quantas vezes o número aparece na lista.
• Exibir a quantidade de ocorrências do número digitado pelo usuário.*/

package Exercicio04;
import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<>();
		int numero,cont = 0;
		for(int i = 0;i<4;i++){
		    System.out.print("Insira 10 numeros inteiros: ");
		    numero = scanner.nextInt();
		    numeros.add(numero);
		}
		System.out.print("Digite o numero que deseja buscar: ");
		int numeroProcurado = scanner.nextInt();
		for(int n : numeros){
		    if(n == numeroProcurado){
		        cont++;
		    }
		}
		System.out.println("O numero "+numeroProcurado+" foi encontrado "+cont+" vezes");

	}
}
