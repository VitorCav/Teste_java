package Vetores;

public class exArrayum {

	public static void main(String[] args) {
		int arrayA[] = {100, 200 , 300, 400, 500};
		int[] arrayB = new int[5];
		
		for (int i = 0; i < arrayA.length ; i++) {
			arrayB[i] = 2*arrayA[i];
			
		}
		
		for (int i = 0; i < arrayA.length ; i++) {
			System.out.println("Array B " + arrayB[i] + " = 2 * " + arrayA[i] + " Array A");
			
		}
		

	}

}
