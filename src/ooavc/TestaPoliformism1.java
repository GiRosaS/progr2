package ooavc;

public class TestaPoliformism1 {
	public static void main (String[] args) {
		Funcionario f1= new Funcionario();
		f1.setSalario(1000);
		
		System.out.println ("O salario do funcionário é " +f1.getSalario());
		System.out.println ("O bonus do funcionário é " +f1.getBonus());
	}

}
