//Exercício 3: construir um programa em Java que leia 2 números inteiros e imprima o maior número lido.
package Exercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o numero 1: ");
        int numero1 = scanner.nextInt();
        System.out.print("Insira o numero 2: ");
        int numero2 = scanner.nextInt();
        if (numero1 >= numero2) {
            System.out.println("O maior numero é o: " + numero1);
        } else {
            System.out.println("O maior numero é o: " + numero2);
        }

        scanner.close();
    }
}
