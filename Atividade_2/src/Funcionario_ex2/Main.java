package Funcionario_ex2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Funcionario f1 = new Funcionario();
		
		System.out.print("Nome do funcionário: ");
		f1.nome = sc.next();
		
		System.out.print("Salario: R$");
		f1.salario = sc.nextDouble();
		
		
		if(f1.salario > 2000) {
			System.out.println("Programa encerrado.");
		} else {
			f1.imprimirdados();
		}
		
		sc.close();
	}

}
