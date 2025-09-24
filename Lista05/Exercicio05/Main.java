/*Exercício 5: Ordenação de Lista de Números
Descrição:
Crie um programa que solicite ao usuário inserir quantos números desejar em 
um ArrayList<Integer>. Em seguida, ordene os números em ordem crescente e 
exiba a lista ordenada.
Requisitos:
• Criar um ArrayList<Integer> para armazenar os números.
• Utilizar Collections.sort() para ordenar os números.
• Exibir a lista ordenada após a ordenação.*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    ArrayList<Integer> numeros = new ArrayList<>();
	    int limite,numero;
	    System.out.print("Quantos números deseja inserir na ArrayList? ");
	    limite = scanner.nextInt();
	    for(int i = 0; i < limite;i++){
	        System.out.print("Insira o numero " + (i+1)+": ");
	        numero = scanner.nextInt();
	        numeros.add(numero);
	    }
	    Collections.sort(numeros);
	    System.out.print("Lista ordenada: "+numeros);
	    scanner.close();
	}
}
