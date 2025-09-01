// 10. Distância Entre Dois Pontos - Desenvolva um programa que leia as coordenadas x1, y1 e x2, y2 de dois pontos no plano cartesiano e calcule a distância entre eles.
package Exercicio10;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.print("Insira o ponto x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Insira o y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Insira o ponto x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Insira o y2: ");
        double y2 = scanner.nextDouble();
        double distancia = Math.sqrt((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
        System.out.println("A distancia entre os pontos é: " + df.format(distancia));
        scanner.close();
    }
}
