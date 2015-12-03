package edu.iut.app;

public interface IApplicationLogListener {
	/**
	 * prototype de la methode newMessage qui est defini dans AbstractApplicationMessageDialog
	 * @param level
	 * @param message
	 */
	void newMessage(String level, String message);

}
