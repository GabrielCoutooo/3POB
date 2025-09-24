/*Exercício 3: Soma de Números e Cálculo da Média
Descrição:
Crie um programa que solicite ao usuário inserir números em um
ArrayList<Double> até que ele digite -1. Depois, exiba a soma e a média dos
números inseridos (excluindo o -1).
Requisitos:
• Criar um ArrayList<Double> para armazenar os números.
• Utilizar um loop while para permitir inserções até o usuário digitar -1.
• Utilizar um loop for para calcular a soma e a média dos números inseridos.*/

package Exercicio03;
import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Double> numeros = new ArrayList<>();
		double numero;
		do{
		    System.out.print("Insira um numero diferente de -1: ");
		    numero = scanner.nextDouble();
		    if(numero != -1){
		        numeros.add(numero);
		    }
		}while(numero != -1);
		double soma = 0;
		for(double n : numeros){
		    soma += n;
		}
		if(numeros.size() > 0){
		    double media = soma/numeros.size();
		    System.out.println("Soma dos numeros: " + soma);
		    System.out.println("Media dos numeros: "+ media);
		}else{
		    System.out.println("Nenhum numero valido foi inserido!");
		}
	}
}
