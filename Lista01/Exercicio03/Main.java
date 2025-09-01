package Exercicio03;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.print("Insira a temperatura em Celsius: ");
        double tempCelsius = scanner.nextDouble();
        double tempFahrenheit = (tempCelsius * 9 / 5) + 32;
        System.out.println(tempCelsius + "°C em Fahrenheit é: " + df.format(tempFahrenheit) + "°F");
        scanner.close();
    }
}
