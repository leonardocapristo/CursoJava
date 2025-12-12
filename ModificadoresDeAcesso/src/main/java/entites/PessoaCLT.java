package entites;

public class PessoaCLT extends Pessoa {


    private Double imposto;

    public PessoaCLT() {
    }

    public PessoaCLT(String nome, Integer idade, Double imposto) {
        super(nome, idade);
        this.imposto = imposto;
    }

    public Double getImposto() {
        return imposto;
    }

    public void setImposto(Double imposto) {
        this.imposto = imposto;
    }

    public String mostrarDados (){
        return this.getNome() + " " + this.getIdade() + " " + this.imposto;
    }
}
