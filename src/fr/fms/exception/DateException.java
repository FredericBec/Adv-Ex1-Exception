package fr.fms.exception;

public class DateException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public DateException(String msg) {
		super(msg);
	}
	
	public DateException() {
		super("Il y a un problème de date !!");
	}
}
