package application;

import java.util.Locale;
import java.util.Scanner;

import entities.*;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Product p = new Product();
		
		System.out.println("Entre com os dados do produto ");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Preço: ");
		double price = sc.nextDouble();
        
		Product product = new Product(name, price);
		
		product.setName("Computer");
		System.out.println("Produto Alterado: " + product.getName());
		product.setPrice(1200.00);
		System.out.println("Alterado preço: $" + product.getPrice());
		
		System.out.println();
		System.out.println("Dados do Produto: " +product);
		
		System.out.println();
		System.out.print("Digite o número de produtos a ser ADICIONADO em estoque:");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Atualização de dados: " +product);
		
		System.out.println();
		System.out.print("Digite o número de produtos a ser REMOVIDO em estoque: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Atualização de dados: " +product);	
		
		sc.close();
		
	}

}
