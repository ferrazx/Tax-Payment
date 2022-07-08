package entities;

public class PessoaFisica extends Taxas {
	
	private Double despesaMedica;
	
	
	public PessoaFisica(String nome, Double rendaAnual, Double despesaMedica) {
		super(nome, rendaAnual);
		this.despesaMedica = despesaMedica;
	}
	
	public Double getDespesaMedica() {
		return despesaMedica;
	}

	public void setDespesaMedica(Double despesaMedica) {
		this.despesaMedica = despesaMedica;
	}

	@Override
	public Double taxas() {
		if (getRendaAnual() < 20000) {
			return getRendaAnual() * 0.15 - despesaMedica * 0.5;
		}
		else {
			return getRendaAnual() * 0.25 - despesaMedica * 0.5;
		}
	}
}
