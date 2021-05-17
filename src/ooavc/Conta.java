package ooavc;

public class Conta {
	//atributos 
	int numero;
	 //String nome;
	Cliente cliente;
	double saldo;
	double limite;
	
	Conta(int numero, Cliente cliente, double saldo, double limite){
		this.numero = numero;
		this.cliente = new Cliente();
		this.saldo=saldo;
		this.limite=limite;
	}	
	
	public int getcontadorCotas() {
		return Conta.contadorContas;
		
	}
	
	//teste
	boolean sacar (double valor) {
		if (valor> this.saldo + this.limite) {
			return false;
		} else {
			this.saldo=this.saldo - valor;
			return true;
		}
		
	}
	
	
	
	
}
