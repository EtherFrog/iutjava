package edu.iut.app;

public interface IApplicationLog {
	/**
	 * Prototype de l'accesseur setMessage
	 * @param message
	 */
	public void setMessage(String message);
	/**
	 * Prototype de l'accesseur getMessage()
	 * @return message
	 */
	public String getMessage();
	/**
	 * Prototype de la procedure addListener qui ajoute un listener donner en parametre
	 * @param listener
	 */
	public void addListener(IApplicationLogListener listener);
	/**
	 * Prototype de l'accesseur getApplicationLogListener()
	 * @return 
	 */
	public IApplicationLogListener[] getApplicationLogListeners();

}
