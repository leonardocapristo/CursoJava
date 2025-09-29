package entities;

public class PessoaFisica extends Pessoa {

	protected Double gastosSaude;

	public PessoaFisica() {

	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public Double imposto() {
        Double imposto = 0.0;
        
        if (this.rendaAnual < 20000.00) {
            imposto = this.rendaAnual * 0.15; // 15% de imposto
        } else {
            imposto = this.rendaAnual * 0.25; // 25% de imposto
        }

        // Se houver gastos com saúde, aplicar o abatimento
        if (this.gastosSaude != null && this.gastosSaude > 0) {
            imposto -= this.gastosSaude * 0.50; // Abate 50% dos gastos com saúde
        }

        return imposto;
	}

}
