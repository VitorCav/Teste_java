package recursivos;

public class Calcular {
	
	private int n;
	
	public int fatorial (int n) {
		
		if (n == 0) {
			return 1;
		}
		
		return n * fatorial (n - 1);		
	}
	
	public int somaAte (int n) {
		if (n == 0) {
			return 0;
		}
		
		return n + somaAte (n - 1);
	}
}
