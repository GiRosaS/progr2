package ooavc;

public class ContaAntiga {
	int numero;
	String nome;
	double saldo;
	double limite;
	
	boolean sacar (double valor) {
		if (valor> this.saldo + this.limite) {
			return false;
		} else {
			this.saldo=this.saldo - valor;
			return true;
		}
		
	}
	
	public int getNumero() {
		return numero;
	}
	
		
	void depositar (double valor) {
		saldo=saldo+valor;
	}
	
	
}
