/*Exercício 6: construir um programa em Java que leia o salário bruto e o sexo de um funcionário. Se o sexo for “M” (masculino), calcular, armazenar e imprimir um desconto de 5% e o salário
líquido, caso contrário, calcular, armazenar e imprimir um desconto de 3% e o salário líquido.
*/
package Exercicio06;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.print("Insira o salario bruto: ");
        double salario = scanner.nextDouble();
        System.out.print("Insira seu sexo: ");
        char sexo = scanner.next().toUpperCase().charAt(0);
        double desconto;
        double salarioLiquido;
        if (sexo == 'M') {
            desconto = salario * 0.05;
        } else if (sexo == 'F') {
            desconto = salario * 0.03;
        } else {
            System.out.println("Sexo inválido! Digite apenas 'M' ou 'F'");
            scanner.close();
            return;
        }
        salarioLiquido = salario - desconto;
        System.out.println("Desconto: R$" + df.format(desconto));
        System.out.println("Salário líquido: R$" + df.format(salarioLiquido));
        scanner.close();
    }
}
