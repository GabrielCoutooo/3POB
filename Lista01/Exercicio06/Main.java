//6. Cálculo do Salário - Escreva um programa que receba o salário bruto de um funcionário e o valor de desconto do INSS. O programa deve calcular e exibir o salário líquido.
package Exercicio06;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.print("Insira o valor do seu salário: ");
        double salario = scanner.nextDouble();
        double descontoINSS = 0;
        if (salario <= 1518) {
            descontoINSS = salario * 0.075;
        } else if (salario <= 2793.88) {
            descontoINSS = salario * 0.09;
        } else if (salario <= 4190.83) {
            descontoINSS = salario * 0.12;
        } else if (salario <= 8157.41) {
            descontoINSS = salario * 0.14;
        }
        double salarioLiquido = salario - descontoINSS;
        System.out.println("Seu salario líquido é: R$" + df.format(salarioLiquido));
        scanner.close();
    }

}
