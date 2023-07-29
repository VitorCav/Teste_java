package aula11;

import java.lang.Math;

public class CalculadoraDistancia {
	
	public double distPlano(double x1, double y1, double x2, double y2) {
		
		double distPlano = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
		
		return distPlano;
	}
	
	// duvida
	public double distEspa(double x1, double y1, double z1, double x2, double y2, double z2) {
		
		double distEspa = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
		
		return distEspa;
	}
	

}
