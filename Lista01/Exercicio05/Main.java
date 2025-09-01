//5. Conversão de Idade para Dias - Desenvolva um programa que leia a idade de uma pessoa em anos e exiba a quantidade aproximada de dias que ela já viveu.
package Exercicio05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira sua idade: ");
        int idade = scanner.nextInt();
        int idadeEmDias = idade * 365;
        System.out.println("Você viveu aproximadamente " + idadeEmDias + "dias!");
        scanner.close();
    }
}
