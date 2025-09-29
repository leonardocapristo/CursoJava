package model.exceptions;

public class IdadeInsuficienteException extends Exception {
	private static final long serialVersionUID = 1L;

	public IdadeInsuficienteException() {
        super("Você não tem idade suficiente para tirar a CNH. A idade mínima é 18 anos.");
    }
}
