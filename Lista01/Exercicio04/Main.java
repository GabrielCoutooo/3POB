//Cálculo de Média Simples - Faça um programa que solicite ao usuário três notas (valores decimais) e exiba a média aritmética delas.
package Exercicio04;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.print("Insira a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Insira a segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Insira a terceira nota: ");
        double nota3 = scanner.nextDouble();
        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("A média dos 3 alunos é: " + df.format(media));
        scanner.close();
    }
}
