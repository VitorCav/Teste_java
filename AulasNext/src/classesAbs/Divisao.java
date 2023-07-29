package classesAbs;

public class Divisao implements OperacaoMatematica{
	
	public Divisao() {
		
	}
	
	public void calcula(int a, int b) {
		System.out.println("Divisao: " + (a/b));
	}

}
