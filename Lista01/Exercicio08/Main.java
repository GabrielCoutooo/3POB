//8. Cálculo do Volume de uma Esfera - Crie um programa que leia o raio de uma esfera e calcule o seu volume.
package Exercicio08;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.print("Insira o valor do raio: ");
        double raio = scanner.nextDouble();
        double pi = 3.14159;
        double volumeEsfera = (4.0 / 3) * pi * Math.pow(raio, 3);
        System.out.println("O volume da esfera é " + df.format(volumeEsfera));
        scanner.close();
    }
}
