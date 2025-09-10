/* Exercício 2: Cálculo da Média de Notas
Descrição:
Desenvolva um programa que peça ao usuário para inserir 4 notas e armazene-as
em um array. Depois, o programa deve calcular e exibir a média das notas.
Requisitos:
• Criar um array de tamanho 4 para armazenar as notas.
• Utilizar um loop for para somar todas as notas e calcular a média.
• Se a média for maior ou igual a 7, exibir "Aprovado", senão, exibir
"Reprovado".*/

package Exercicio02;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int[] notas = new int[4];
	    System.out.println("Insira as "+notas.length + " notas: ");
	    for(int i = 0;i < notas.length;i++){
	    System.out.print("Nota "+ (i+1) + ": ");
	    notas[i] = scanner.nextInt();
	    }
	    double soma = 0;
	    for(int i = 0; i< notas.length;i++){
	        soma +=notas[i];
	    if(notas[i] >= 7){
	        
	    System.out.println("Aluno "+ (i+1) +" aprovado!");
	    }else{
	        System.out.println("Aluno "+ (i+1) +" reprovado!");
	    }
	    }
	    double media = soma/ notas.length;
	    System.out.println("Média das notas é: "+media);
	    scanner.close();
    }
}
