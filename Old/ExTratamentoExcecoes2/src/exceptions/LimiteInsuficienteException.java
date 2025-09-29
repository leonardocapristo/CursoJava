package exceptions;

public class LimiteInsuficienteException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;

	public LimiteInsuficienteException () {
		super("O saque desejado é maior que seu limite de saque");
	}

}
