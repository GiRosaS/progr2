package ooavc;

public abstract class Funcionario {
	protected String nome;
	protected String cpf;
	protected String departamento;
	protected String dataAdmissao;
	protected double salario;
	protected String status;
	
	//v2 do bonus percent fixo sobre o salario 5%
//	
//	double getBonus() {
//		return this.salario * 0.05;
//	}
		
	abstract double getBonus() ;
//		return this.salario * 0.05;
	
	
	protected String getNome() {
		return nome;
	}
	protected void setNome(String nome) {
		this.nome = nome;
	}
	protected String getCpf() {
		return cpf;
	}
	protected void setCpf(String cpf) {
		this.cpf = cpf;
	}
	protected String getDepartamento() {
		return departamento;
	}
	protected void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	protected String getDataAdmissao() {
		return dataAdmissao;
	}
	protected void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	protected double getSalario() {
		return salario;
	}
	protected void setSalario(double salario) {
		this.salario = salario;
	}
	protected String getStatus() {
		return status;
	}
	protected void setStatus(String status) {
		this.status = status;
	}
	
	public void verifica() {
		
	}
	
	//void bonificacao (double bonus) {
	//	salario+=bonus;
	//}
	
}
