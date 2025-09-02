/* 
Exercício 7: construir um programa em Java que leia um número inteiro e imprima “Positivo”,
se o número lido for maior que 0, imprima “Negativo”, se o número lido for menor que 0 e
imprima “Nulo”, se o número lido for igual a 0.
*/
package Exercicio07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira um numero: ");
        int numero = scanner.nextInt();
        if (numero > 0) {
            System.out.println("Positivo");
        } else if (numero < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Nulo");
        }
        scanner.close();
    }
}
