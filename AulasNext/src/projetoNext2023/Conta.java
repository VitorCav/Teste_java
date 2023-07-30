package projetoNext2023;

public abstract class Conta {
	
	private int numeorAgencia;
	private long numeorConta;
	private double saldo;
	
	public abstract void debitar(double valor);
	public abstract void cerditar(double valor);

}
