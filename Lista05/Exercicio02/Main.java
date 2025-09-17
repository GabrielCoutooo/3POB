/*Exercício 2: Remover um Elemento da Lista
Descrição:
Escreva um programa que solicite ao usuário inserir 5 nomes em um
ArrayList<String>. Em seguida, peça para o usuário informar um nome para ser
removido da lista. Exiba a lista após a remoção.
Requisitos:
• Criar um ArrayList<String> para armazenar os nomes.
• Utilizar remove() para excluir o nome informado.
• Se o nome não existir na lista, exibir uma mensagem informando.*/
package Exercicio02;
import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
	    ArrayList<String> nomes = new ArrayList<>();
	    Scanner scanner = new Scanner(System.in);
	    
	        System.out.println("Insira 5 nomes no Array: ");
	    for(int i = 0; i< 5; i++){
	        System.out.print("Nome "+(i+1)+": ");
	        String nome = scanner.nextLine();
	        nomes.add(nome);
	    }
	        System.out.println("Lista de nomes atual: "+nomes);
	        System.out.print("Insira o nome que deseja remover: ");
	        String removerNome = scanner.nextLine();
	        if(nomes.remove(removerNome)){
	            System.out.println("\nO nome \""+removerNome + "\" foi removido com sucesso");
	        }else{
	            System.out.println("\nO nome \""+removerNome + "\" não foi encontrado na lista");
	        }
		System.out.print("Array final de nomes: "+nomes);
		scanner.close();
	}
}
