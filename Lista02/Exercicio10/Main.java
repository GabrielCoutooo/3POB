/* Exercício 10: construir um programa em Java que leia o ano de nascimento e o sexo de uma
pessoa e que calcule a sua idade aproximada. Se o sexo for igual a “M” (masculino) e a idade for
igual a 18, imprimir “Serviço Militar Obrigatório”, caso contrário, imprimir “Isento de Serviço
Militar”.*/
package Exercicio10;

import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int anoAtual = LocalDate.now().getYear();
        System.out.print("Insira o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();
        System.out.println("Insira o sexo(M/F): ");
        char sexo = scanner.next().toUpperCase().charAt(0);
        int idade = anoAtual - anoNascimento;
        if(idade == 18 && sexo == 'M'){
            System.out.println("Serviço Militar Obrigatório!");
        }else{
            System.out.println("Isento do Serviço Militar!");
        }
        scanner.close();
    }
}
