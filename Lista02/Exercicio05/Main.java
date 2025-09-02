/*Exercício 5: construir um programa em Java que leia o ano de nascimento de uma pessoa e que calcule a sua idade aproximada. Se a idade aproximada for maior ou igual a 16, imprimir “Apto
a ser eleitor”, imprimir “Inapto a ser eleitor”, caso contrário.
*/
package Exercicio05;

import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int anoAtual = LocalDate.now().getYear();
        System.out.print("Insira o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();
        int idade = anoAtual - anoNascimento;
        System.out.println("Idade aproximada: " + idade);
        if (idade >= 16) {
            System.out.println("Apto a ser eleitor!");
        } else {
            System.out.println("Inapto a ser eleitor!");
        }
        scanner.close();
    }
}
