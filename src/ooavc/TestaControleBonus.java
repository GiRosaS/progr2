package ooavc;

public class TestaControleBonus {

	public static void main(String[] args) {
		ControleBonus controle = new ControleBonus();
		
//		Funcionario f1 = new Funcionario();
//		f1.setSalario(1000);
//		System.out.println ("Bonus  funcionario "+ f1.getBonus());
		
//		controle.setTotalBonus(f1);
//		System.out.println ("total Bonus contabilizado: "+ controle.getTotalBonus());
	
		Gerente g1 = new Gerente();
		g1.setSalario(10000);
		System.out.println ("Bonus Gerente "+ g1.getBonus());
		
		controle.setTotalBonus(g1);
		System.out.println ("Total Bonus contabilizado: "+ controle.getTotalBonus());
	}

}
