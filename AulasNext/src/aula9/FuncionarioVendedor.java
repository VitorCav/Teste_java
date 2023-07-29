package aula9;

public class FuncionarioVendedor extends Funcionario {
	
	private double acumuladoVendas;	
	
	public FuncionarioVendedor(double salario) {
		super(salario);		
	}
	
	public void totalVendas (double n) {
		acumuladoVendas = acumuladoVendas + n;		
	}
	
	public double salarioTotal() {		
		return salario + acumuladoVendas * 0.5;	
	}	
	
}
