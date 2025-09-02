//Exercício 2: construir um programa em Java que leia a idade de uma pessoa e imprima “Maior de idade”, se a idade lida for maior ou igual a 18 e imprima “Menor de idade”, caso contrário.
package Exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira sua idade: ");
        int idade = scanner.nextInt();
        if (idade >= 18) {
            System.out.println("Você é maior de idade!");
        } else {
            System.out.println("Você é menor de idade!");
        }
        scanner.close();
    }
}
