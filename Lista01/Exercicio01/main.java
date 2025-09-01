package Exercicio01;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira um número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Insira o segundo número: ");
        int numero2 = scanner.nextInt();
        int resultado = numero1 + numero2;
        System.out.println(numero1 + " + " + numero2 + " = " + resultado);
      scanner.close();
    }
}

