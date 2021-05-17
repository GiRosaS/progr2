package ooavc;

public class ContaPoupanca extends ContaAntiga {
	
	void correcao(double taxa) {
		this.saldo+= this.saldo * 1.3;
		
	}
}