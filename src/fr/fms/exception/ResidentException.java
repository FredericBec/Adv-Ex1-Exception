package fr.fms.exception;

public class ResidentException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public ResidentException(String msg) {
		super(msg);
	}
	
	public ResidentException() {
		super("Il n'est pas possible de réduire la population !");
	}
}
