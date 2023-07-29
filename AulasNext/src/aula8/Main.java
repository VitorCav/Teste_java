package aula8;

public class Main {

	public static void main(String[] args) {
		Fruta f1 = new Fruta(true, true);
		Fruta f2 = new Fruta(true, false);
		
		System.out.println(f1.getCaroco() + " " + f1.getCasca());
		System.out.println(f2.getCaroco() + " " + f2.getCasca());
		
		Lampada l1 = new Lampada(true);
		Lampada l2 = new Lampada(100, true);
		Lampada l3 = new Lampada();
		
		System.out.println(l1.getEstado() + " " + l1.getWatts());
		System.out.println(l2.getEstado() + " " + l2.getWatts());
		System.out.println(l3.getEstado() + " " + l3.getWatts());
		
		Produto p1 = new Produto("Maca", 4.3, 55700);
		Produto p2 = new Produto("Arroz", 2.3, 78);
		
		System.out.println(p1.getDescricao() + " " + p1.getValor() + " " + p1.getEstoque());
		System.out.println(p2.getDescricao() + " " + p2.getValor() + " " + p2.getEstoque());

	}

}
