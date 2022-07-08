package entities;

public class PessoaJuridica extends Taxas{

	private Double funcionarios;
	
	public PessoaJuridica(String nome, Double rendaAnual) {
		super(nome, rendaAnual);
	}


	public PessoaJuridica(String nome, Double rendaAnual, Double funcionarios) {
		super(nome, rendaAnual);
		this.funcionarios = funcionarios;
	}


	public Double getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(Double funcionarios) {
		this.funcionarios = funcionarios;
	}


	@Override
	public Double taxas() {
		if(funcionarios <= 10) {
			return getRendaAnual() * 0.16;
		}
		else {
			return getRendaAnual() * 0.14;
		}
	}
	
	

}
