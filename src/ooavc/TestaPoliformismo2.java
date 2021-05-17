package ooavc;

public class TestaPoliformismo2 {
	public static void main (String[] args) {
		Gerente g2= new Gerente();
		g2.setSalario(10000);
				System.out.println ("O salario do gerente é " +g2.getSalario() );
				System.out.println ("O bonus do gerente é " +g2.getBonus() );
	}

}
