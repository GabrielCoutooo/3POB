/*Exercício 1: Adicionar e Exibir Números
Descrição:
Crie um programa que permita ao usuário inserir quantos números desejar em
um ArrayList<Integer>. Após a inserção, o programa deve exibir todos os números
digitados.
Requisitos:
• Criar um ArrayList<Integer> para armazenar os números.
• Utilizar um loop while para permitir múltiplas inserções até o usuário
decidir parar.
• Exibir os números armazenados no ArrayList.*/

import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
	    ArrayList<Integer> numeros = new ArrayList<>();
	    Scanner scanner = new Scanner(System.in);
	    boolean continuar = true;
	    
	    while(continuar){
	        System.out.print("Insira um numero no Array: ");
	        int numero = scanner.nextInt();
	        numeros.add(numero);
	        System.out.print("Deseja adicionar mais algum numero?(s/n): ");
	        String resposta = scanner.next();
	        if(resposta.equalsIgnoreCase("n")){
	            continuar = false;
	        }
	    }
		System.out.print("Numeros digitados: ");
		for(int num : numeros){
		    System.out.print(num+" ");
		}
		scanner.close();
	}
}
