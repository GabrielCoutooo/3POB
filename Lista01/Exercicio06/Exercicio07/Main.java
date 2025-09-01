//7. Cálculo do Perímetro e Área de um Retângulo - Faça um programa que solicite a base e a altura de um retângulo e exiba o seu perímetro e sua área.
package Exercicio07;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.print("Insira a base do retângulo: ");
        double base = scanner.nextDouble();
        System.out.print("Insira a altura do retângulo: ");
        double altura = scanner.nextDouble();
        double area = base * altura;
        double perimetro = 2 * (base + altura);
        System.out.println("A área do retângulo é: " + df.format(area) + "m²");
        System.out.println("O perímetro do retângulo é: " + df.format(perimetro));
        scanner.close();
    }
}
