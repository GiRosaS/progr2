package ooavc;

public class ContaCorrente extends ContaAntiga {
	void correcao(double taxa) {
		this.saldo+= this.saldo * 1.2;
		
	}
}
