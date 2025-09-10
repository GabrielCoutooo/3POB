/*Exercício 4: Contagem de Números Pares em um Array
Descrição:
Crie um programa que solicite ao usuário 8 números inteiros e armazene-os em 
um array. O programa deve contar e exibir a quantidade de números pares no 
array.
Requisitos:
• Criar um array de tamanho 8.
• Utilizar um loop for para percorrer o array e contar quantos números são 
pares.
• Exibir a quantidade de números pares encontrados.
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[8];
        System.out.println("Insira os " + numeros.length + " numeros: ");
        int cont = 0;
        for(int i = 0;i<numeros.length;i++){
            System.out.print("Numero "+ (i+1)+": ");
            numeros[i] = scanner.nextInt();
            if(numeros[i] % 2 == 0)
            cont++;
        }
        System.out.print("Existem " + cont + " numeros pares na array");
        scanner.close();
    }
}