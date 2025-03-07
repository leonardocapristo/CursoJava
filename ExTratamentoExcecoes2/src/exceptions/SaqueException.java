package exceptions;


/*Exception te obriga a tratar e propragar, RuntimeException nao obriga tratar e propragar, mas quebra o c'odigo */
public class SaqueException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SaqueException() {
		super("ta liso");
		
	}
}
