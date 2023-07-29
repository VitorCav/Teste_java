package Vetores;

public class exArraytres {

	public static void main(String[] args) {
		int a[] = {74,	 -98,	 -82,	 -77,	  49,	  64,	 -64,	 -55,	  75,	 -47};
		int b[] = { -49,	 -71,	 -37,	  55,	 -13,	 -47,	  75,	  -9,	  32,	 -83};
		int[] c = new int[10];
		
		for (int i = 0; i < c.length; i++) {
			
			c[i] = a[i] + b[i];
			
		}
		
		for (int i = 0; i < c.length; i++) {
			
			System.out.println("C: " + c[i] + " = " + a[i] + " + " + b[i]);
			
		}
		
		
		
		

	}

}
