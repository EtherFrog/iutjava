package edu.iut.app;

import java.util.ArrayList;

public abstract class AbstractApplicationLog implements IApplicationLog {
	//variable de type chaine qui permetera d'affecter le message que l'on souhaite afficher 
	public String message;
	// Liste de listener
	protected ArrayList<IApplicationLogListener> listeners;
	/**
	 * Constructeur de la classe 
	 */
	public AbstractApplicationLog() {
		message = null;
		listeners = new ArrayList<IApplicationLogListener>();

	}

	/**
	 * Procedure qui permet d'ajouter un log listener
	 * @param listener
	 */
	public void AddLogListener(IApplicationLogListener listener){

		listeners.add(listener);

	}
	
	/**
	 * Accesseur
	 * @return listeners
	 */
	public ArrayList<IApplicationLogListener> GetListeners(){

		return listeners;

	}

	/** 
	 *  Fonction venant de l'interface par héritage
	 */
	@Override
	public abstract void setMessage(String message);
	/**
	 * Accesseur qui retourne le message
	 * @return message
	 */
	@Override
	public String getMessage() {
		return message;
	}
	
	
	/** Listener action */
	protected void fireMessage(String level, String message) {
		for (IApplicationLogListener listener_i : listeners) {
			listener_i.newMessage(level, message);
		}
	}
}
