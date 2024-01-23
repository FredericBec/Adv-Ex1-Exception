package fr.fms.exception;

public class RemunerationException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public RemunerationException(String msg) {
		super(msg);
	}
	
	public RemunerationException() {
		super("Il y a un problème de rémunération");
	}
}
