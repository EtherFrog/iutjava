package edu.iut.exceptions;

public class IUTException extends Exception {
	/**
	 * Constructeur de la classe IUTException
	 */
	public IUTException() {
		super();
		edu.iut.app.ApplicationSession.instance().getExceptionLogger().severe("empty");
	}
	/**
	 * Constructeur de la classe IUTException qui prend en parametre une instance de IUTException
	 * @param e
	 */
	public IUTException(IUTException e) {
		super (e);
		edu.iut.app.ApplicationSession.instance().getExceptionLogger().severe(e.getMessage());
	}
	/**
	 * Constructeur de la classe IUTException qui prend en parametre un message de type chaine
	 * @param message
	 */
	public IUTException(String message) {
		super(message);
		edu.iut.app.ApplicationSession.instance().getExceptionLogger().severe(message);
	}
	
}
