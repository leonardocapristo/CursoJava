package model.exceptions;

public class IdadeInsuficienteException extends Exception {
    public IdadeInsuficienteException() {
        super("Você não tem idade suficiente para tirar a CNH. A idade mínima é 18 anos.");
    }
}
