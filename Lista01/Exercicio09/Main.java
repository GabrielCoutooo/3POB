//9. Conversão de Moeda - Faça um programa que leia um valor em reais (R$) e a cotação do dólar no dia. O programa deve calcular e exibir o valor equivalente em dólares (US$).
package Exercicio09;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.print("Insira o valor em R$ que deseja converter: ");
        double reais = scanner.nextDouble();
        System.out.print("Insira a cotação atual do dollar: ");
        double cotacaoDollar = scanner.nextDouble();
        double dollar = reais / cotacaoDollar;
        System.out.println("R$" + df.format(reais) + "equivale a US$ " + df.format(dollar));
        scanner.close();
    }
}
