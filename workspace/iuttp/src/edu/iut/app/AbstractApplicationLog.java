package edu.iut.app;

import java.util.ArrayList;

public abstract class AbstractApplicationLog implements IApplicationLog {

	protected String message;

	protected ArrayList<IApplicationLogListener> listeners;

	public AbstractApplicationLog() {
		message = null;
		listeners = new ArrayList<IApplicationLogListener>();

	}

	public void AddLogListener(IApplicationLogListener listener){

		listeners.add(listener);

	}

	public ArrayList<IApplicationLogListener> GetListeners(){

		return listeners;

	}

	/** TP1 : Fonction venant de l'interface par héritage */
	@Override
	public abstract void setMessage(String message);

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
