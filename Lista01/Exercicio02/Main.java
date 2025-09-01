package Exercicio2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.print("Insira o valor do raio para calcular a área do círculo: ");
        double raio = scanner.nextDouble();
        double pi = 3.14159;
        double areaCirculo = pi * (raio * raio);
        System.out.println("Área do circulo é: " + df.format(areaCirculo));
        scanner.close();
    }
}
