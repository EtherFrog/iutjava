package edu.iut.gui.listeners;

import edu.iut.app.IApplicationLogListener;
/**
 * 
 * Classe abstraite gerant la creation de boite de dialogue
 *
 */
public abstract class AbstractApplicationMessageDialog implements
		IApplicationLogListener {
	/**
	 * Creer un nouveau message en faisant appel a la methode showMessage
	 * en prenant en parametre un niveau et un message
	 * @param level
	 * @param message
	 */
	@Override
	public void newMessage(String level, String message) {
		showMessage(level,message);
	}
	
	/**
	 * Mprocedure abstraite permettant l'affichage du message et du niveau donner en parametre  
	 * @param level
	 * @param message
	 */
	protected abstract void showMessage(String level, String message);
}
