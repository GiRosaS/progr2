package ooavc;

public class Gerente extends Funcionario implements AcessoBancoInterno {
	int senha;
	
	public boolean verifica (int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso autorizado");
			return true;
		}else{
			System.out.println("Acesso N?O autorizado");
			return false;
		}
	}
	
	
	//v2 do bonus percent fixo sobre o salario 5%
	//somente gerente
		//double getBonus() {
		//	return this.salario * 0.15;
		//}
	
//	double getBonus() {
//			//return this.salario * 0.05+5000;
//			return super.getBonus()+5000;
//			}
		
		double getBonus() {
			return this.salario * 0.05+5000;
		}
	
	
}
