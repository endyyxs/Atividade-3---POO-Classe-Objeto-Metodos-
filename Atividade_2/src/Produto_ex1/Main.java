package Produto_ex1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Produto p1 = new Produto();
		
		System.out.println("CADASTRAR PRODUTO");
		System.out.print("Nome do produto: ");
		p1.nome = sc.next();
		
		System.out.print("Preço do produto: ");
		p1.preco = sc.nextFloat();
		
		System.out.print("Quantidade no estoque: ");
		p1.qtestoque = sc.nextInt();
		
		System.out.println("---------------------------------");
		p1.mostrardados();
		System.out.println("---------------------------------");
		
		System.out.println("Adicione novo estoque: ");
		int qtd = sc.nextInt();
		p1.entradaestoque(qtd);
		
		p1.mostrardados();
		
		System.out.println("------------------------------------------------");
		System.out.println("Qual é a quantidade a ser retirada do estoque?");
		qtd = sc.nextInt();
		boolean atualizar = p1.saidadedados(qtd);
		
		
		if(atualizar) {
			System.out.println("---------------------------------");
			p1.mostrardados();
			System.out.println("---------------------------------");
		}
		
		sc.close();
	}

}
