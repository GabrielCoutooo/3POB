//Exercício 4: construir um programa em Java que leia um número inteiro e imprima “PAR”, se o número for par e imprima “ÍMPAR”, se o número for ímpar.
package Exercicio04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o numero: ");
        int numero = scanner.nextInt();
        if (numero % 2 == 0) {
            System.out.println("O número é Par!");
        } else {
            System.out.println("O número é Impar!");
        }
        scanner.close();
    }
}
