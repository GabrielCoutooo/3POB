/*
 * Crie um programa que solicite ao usuário um número N e utilize um loop for
 * para calcular a soma dos primeiros N números naturais.
 * Requisitos:
 * • O programa deve utilizar um contador para iterar de 1 até N.
 * • Deve utilizar um acumulador para somar os valores sucessivos.
 * • Ao final, exibir a soma total.
 */
package Exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira um numero n: ");
        int n = scanner.nextInt();
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += i;
        }
        System.out.println("A soma dos primeiros " + n + " números naturais é: " + soma);
        scanner.close();
    }
}
