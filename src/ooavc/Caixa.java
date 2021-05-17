package ooavc;

public class Caixa extends Funcionario implements AcessoBancoInterno{
	int senha;
	
	public boolean verifica (int senha) {
		//metodo de verificacao da senha
		//implementação diferente do metodo
		//da classe Gerente
		//c
		return false;
		
	}
	double getBonus() {
		return 0;
		
	}
}
