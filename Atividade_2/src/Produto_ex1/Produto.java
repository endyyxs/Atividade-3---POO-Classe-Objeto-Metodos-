package Produto_ex1;

public class Produto {
	String nome;
	float preco;
	int qtestoque;
	float valortotal;
	
	public void mostrardados() {
		System.out.printf("Nome do produto: %s %n", nome);
		System.out.printf("Preco do produto: %.2f %n", preco);
		System.out.printf("Quantidade no estoque: %d %n", qtestoque);
		System.out.printf("Valor total no estoque: %.2f %n", valortotal());
	}
	
	public void entradaestoque(int qtd) {
		qtestoque += qtd;
	}
	
	public boolean saidadedados(int qtd) {
		if(qtd > qtestoque) {
			System.out.println("A quantidade ultrapassa o estoque disponivel!");
			return false;
		} else {
			qtestoque -= qtd;
			return true;
		}
	}
	
	public float valortotal() {
		return qtestoque * preco;
	}
}
