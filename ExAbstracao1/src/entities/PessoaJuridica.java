package entities;

public class PessoaJuridica extends Pessoa {
	
	protected Integer quantidadeFuncionarios;
	
	public PessoaJuridica() {

	}

	public PessoaJuridica(String nome, Double rendaAnual, Integer quantidadeFuncionarios) {
		super(nome, rendaAnual);
		this.quantidadeFuncionarios = quantidadeFuncionarios;
	}



	public Integer getQuantidadeFuncionarios() {
		return quantidadeFuncionarios;
	}

	public void setQuantidadeFuncionarios(Integer quantidadeFuncionarios) {
		this.quantidadeFuncionarios = quantidadeFuncionarios;
	}

	@Override
	public Double imposto() {
        Double imposto = 0.0;
        
        // Verifica a quantidade de funcionários para determinar a taxa de imposto
        if (this.quantidadeFuncionarios > 10) {
            imposto = this.rendaAnual * 0.14; // 14% se tiver mais de 10 funcionários
        } else {
            imposto = this.rendaAnual * 0.16; // 16% se tiver 10 ou menos funcionários
        }
        
        return imposto;
	}

}
