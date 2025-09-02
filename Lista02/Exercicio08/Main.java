/*Exercício 8: construir um programa em Java que leia a quantidade de disciplinas em que um
aluno não alcançou a média. Se a quantidade for igual a 0, imprimir “Aprovado”, se a quantidade
for menor ou igual a 5, imprimir “Recuperação” e se a quantidade for maior que 5, imprimir
“Reprovado”. */
package Exercicio08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de disciplinas em que o aluno não alcançou a média: ");
        int disciplinas = scanner.nextInt();

        if (disciplinas == 0) {
            System.out.println("Aprovado");
        } else if (disciplinas <= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        scanner.close();
    }
}
