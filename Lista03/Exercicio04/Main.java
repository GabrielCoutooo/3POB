/* Exercício 4: Média de notas de uma turma

Descrição:
Desenvolva um programa que calcule a média das notas de uma turma, onde
o usuário informe quantos alunos há na turma e suas respectivas notas.
Requisitos:
• O programa deve solicitar a quantidade de alunos.
• Deve utilizar um loop for para receber as notas de cada aluno.
• Utilizar um acumulador para somar todas as notas.
• No final, exibir a média da turma.*/

package Exercicio04;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Insira a quantidade de alunos: ");
	    int quantAlunos = scanner.nextInt();
	    double[] notas = new double[quantAlunos];
	    double somaNotas = 0;
	    for(int i = 0; i<quantAlunos;i++){
	        System.out.print("Insira a nota do aluno "+(i+1) +": ");
	        notas[i] = scanner.nextDouble();
	        somaNotas += notas[i];
	        
	    }
	    double media = somaNotas/quantAlunos;
	    System.out.println("A media da turma foi: "+media);
	    scanner.close();
		
	}
}
