/*Escreva um programa que solicite um número ao usuário e exiba a tabuada
desse número de 1 a 10, utilizando um loop while.
Requisitos:
• O programa deve pedir um número inteiro ao usuário.
• Utilizar um contador para iterar de 1 a 10.
• Exibir a multiplicação do número pelo contador em cada iteração.*/
package Exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira um numero n: ");
        int n = scanner.nextInt();
        int i = 1;
        int resultado = 0;
        while (i <= 10) {
            resultado = n * i;
            System.out.println(n + " X " + i + " = " + resultado);
            i++;
        }
        scanner.close();
    }
}
