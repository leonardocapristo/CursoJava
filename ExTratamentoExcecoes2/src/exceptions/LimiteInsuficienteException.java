package exceptions;

public class LimiteInsuficienteException extends RuntimeException {
	
	public LimiteInsuficienteException () {
		super("O saque desejado é maior que seu limite de saque");
	}

}
