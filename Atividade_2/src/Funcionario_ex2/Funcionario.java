package Funcionario_ex2;

public class Funcionario {
	String nome;
	double salario;
	
	public void imprimirdados(){
		double salario_antigo = salario;
		
		if(salario >= 1 && salario <= 1000) {
			salario += salario * 0.15;
		} else if(salario >= 1001 && salario <= 1500) {
			salario += salario * 0.10;
		} else if(salario >= 1501 && salario <= 2000) {
			salario += salario * 0.05;
		}
		
		System.out.println(" ");
		System.out.printf("Nome do funcionário: %s %n", nome);
		System.out.printf("Salario antigo: R$%.2f %n", salario_antigo);
		System.out.printf("Salario atual: R$%.2f %n", salario);
	}
	
	
}
