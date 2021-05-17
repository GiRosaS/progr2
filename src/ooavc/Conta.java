package ooavc;
//versao conta3
public class Conta {
	//atributos 
	private static int contadorContas;
	int numero;
	 //String nome;
	Cliente cliente;
	double saldo;
	double limite;
	
	Conta(int numero, String nome, Cliente cliente, double saldo, double limite){
		this.numero = numero;
		this.cliente = new Cliente();
		this.cliente.nome=nome;
		this.saldo=saldo;
		this.limite=limite;
		contadorContas++;
	}	
	
	public int getcontadorCotas() {
		return Conta.contadorContas;
		
	}
	
		
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
