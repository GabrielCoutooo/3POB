/*Exercício 9: construir um programa em Java que leia as 2 notas de um aluno e que calcule,
armazene e imprima a média. Se a média for maior ou igual a 7, imprimir “Aprovado”, caso
contrário, realizar a leitura de uma terceira nota, que terá peso 2 e calcular, armazenar e imprimir
uma nova média. Se a nova média for maior ou igual a 6, imprimir “Aprovado”, caso contrário,
imprimir “Reprovado”. */
package Exercicio09;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota1: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a nota2: ");
        double nota2 = scanner.nextDouble();
        double media = (nota1 + nota2) / 2;
        if(media >= 7){
            System.out.println("Aprovado!");
        }else{
            System.out.print("Insira a nota3: ");
            double nota3 = scanner.nextDouble();
            media = ((nota1 + nota2)+ (nota3 *2)) / 4;
            if(media >= 6){
                System.out.println("Aprovado!");
            }else{
                System.out.println("Reprovado!");
            }
        }
        scanner.close();
    }
}
