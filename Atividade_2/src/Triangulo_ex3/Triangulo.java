package Triangulo_ex3;

public class Triangulo {
	double a;
	double b;
	double c;
	
	public double areatriangulo() {
		
		double p = (a + b + c)/2;
		double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		
		return area;
	}
}
