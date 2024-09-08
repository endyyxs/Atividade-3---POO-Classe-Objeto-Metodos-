package Trimestre_ex4;

public class Trimestre {
	String nome;
	double tri1;
	double tri2;
	double tri3;
	double notafinal;
	
	public double calcularnota() {
		return notafinal = tri1 + tri2 + tri3;
	}	
	
	public void notafinal() {
		if(notafinal >= 70) {
			System.out.printf("Aluno %s, aprovado!", nome);
		} else {
			double pontosfaltando = 70 - notafinal;
			System.out.printf("Aluno %s, reprovado! Faltam %.2f pontos para ser aprovado!", nome, pontosfaltando);
		}
	}
}
