package Triangulo_ex3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Triangulo t1 = new Triangulo();
		Triangulo t2 = new Triangulo();
		
		
		System.out.println("TRIÂNGULO 1");
		System.out.print("Lado 1 do triangulo: ");
		t1.a = sc.nextDouble(); 
		
		System.out.print("Lado 2 do triangulo: ");
		t1.b = sc.nextDouble(); 
		
		System.out.print("Lado 3 do triangulo: ");
		t1.c = sc.nextDouble(); 
		
		System.out.println(" ");
		
		System.out.println("TRIÂNGULO 2");
		System.out.print("Lado 1 do triangulo: ");
		t2.a = sc.nextDouble(); 
		
		System.out.print("Lado 2 do triangulo: ");
		t2.b = sc.nextDouble(); 
		
		System.out.print("Lado 3 do triangulo: ");
		t2.c = sc.nextDouble(); 
		
		double area1 = t1.areatriangulo();
		double area2 = t2.areatriangulo();
		
		System.out.println(" ");
		System.out.printf("Área do Triângulo 1: %.2f%n", area1);
		System.out.printf("Área do Triângulo 2: %.2f%n", area2);
		
		System.out.println(" ");
		
		System.out.println("---------------------------------");
		if(area1 > area2) {
			System.out.println("O triângulo 1 tem a maior área!");
		} else if(area2 > area1) {
			System.out.println("O triângulo 2 tem a maior área!");
		} else {
			System.out.println("Os dois tem áreas iguais!");
		}
		System.out.println("---------------------------------");
		
		sc.close();
	}

}
