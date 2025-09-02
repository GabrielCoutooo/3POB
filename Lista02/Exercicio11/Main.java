/*Exercício 11: construir um programa em Java que leia os valores de A, B e C e que imprima
“Não forma triângulo”, se um dos valores for maior que a soma dos outros 2, caso contrário,
imprimir “Forma triângulo”. */
package Exercicio11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira um valorA:");
        int valorA = scanner.nextInt();
        System.out.print("Insira um valorB:");
        int valorB = scanner.nextInt();
        System.out.print("Insira um valorC:");
        int valorC = scanner.nextInt();
        if (valorA > valorB + valorC || valorB > valorA + valorC || valorC > valorA + valorB) {
            System.out.println("Não forma triângulo");
        } else {
            System.out.println("Forma triângulo");
        }
        scanner.close();
    }
}
