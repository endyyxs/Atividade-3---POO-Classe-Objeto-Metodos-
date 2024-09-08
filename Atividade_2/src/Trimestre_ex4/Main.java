package Trimestre_ex4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Trimestre t = new Trimestre(); 
		
		System.out.print("Nome do aluno: ");
		t.nome = sc.next();
		System.out.print("Digite a nota do 1° trimestre: ");
		t.tri1 = sc.nextDouble();
		
		while(t.tri1 < 0 || t.tri1 > 30) {
			System.out.print("Nota inválida! Digite uma nota entre 0 e 30.");
			t.tri1 = sc.nextDouble();
		}
		
		System.out.print("Digite a nota do 2° trimestre: ");
		t.tri2 = sc.nextDouble();
		
		while(t.tri2 < 0 || t.tri2 > 35) {
			System.out.print("Nota inválida! Digite uma nota entre 0 e 35.");
			t.tri2 = sc.nextDouble();
		}
		
		System.out.printf("Digite a nota do 3° trimestre: ");
		t.tri3 = sc.nextDouble();
		
		while(t.tri3 < 0 || t.tri3 > 35) {
			System.out.print("Nota inválida! Digite uma nota entre 0 e 35.");
			t.tri3 = sc.nextDouble();
		}
		
		double nota = t.calcularnota();
		System.out.print("Nota final:" + nota);
		t.notafinal();
		
		
		sc.close();
	}

}
