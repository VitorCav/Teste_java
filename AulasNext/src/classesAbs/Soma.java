package classesAbs;

public class Soma implements OperacaoMatematica{
	
	public Soma() {
		
	}
	
	public void calcula(int a, int b) {
		System.out.println("Soma: " + (a+b));
	}

}
