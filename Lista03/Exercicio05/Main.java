/* Exercício 5: Números primos em um intervalo
Descrição:
Escreva um programa que solicite dois números ao usuário e exiba todos os
números primos no intervalo entre eles, utilizando um loop aninhado (for
dentro de for).
Requisitos:
• O programa deve solicitar dois números inteiros positivos (início e fim
do intervalo).
• Deve utilizar um loop externo para percorrer os números dentro do
intervalo.
• Deve utilizar um loop interno para verificar se cada número é primo.
• Exibir apenas os números primos encontrados.*/

package Exercicio05;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Insira o primeiro numero: ");
	    int n1 = scanner.nextInt();
	    System.out.print("Insira o segundo numero: ");
	    int n2 = scanner.nextInt();
	    System.out.println("Numeros primos no intervalo de"+n1 + "até"+ n2+ ":");
	    for(int i = n1 ; i<n2 ;i++){
	        boolean primo = true;
	        if(i < 2){
	            primo = false;
	        }else{
	            for(int j = 2;j<= Math.sqrt(i);j++){
	                if(i % j == 0){
	                primo = false;
	                break;
	                }
	            }
	        }
	        
	    if(primo){
	        System.out.print(i + " ");
	    }
	}
	    scanner.close();
 }
}
