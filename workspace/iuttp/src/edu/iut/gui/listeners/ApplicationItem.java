package edu.iut.gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iut.gui.frames.SchedulerFrame;

/**
 * Classe qui permet d'ecouter et de lancer les evenements de chaque item
 *
 */
public class ApplicationItem implements ActionListener {
	SchedulerFrame sf = new SchedulerFrame();

	public void actionPerformed(ActionEvent evt) {
		
		switch (evt.getActionCommand()) {
		case "Month":
			sf.monthView.setVisible(true);
			sf.weekView.setVisible(false);
			sf.dayView.setVisible(false);

			break;

		case "Week":
			sf.weekView.setVisible(true);
			sf.dayView.setVisible(false);
			sf.monthView.setVisible(false);

			break;

		case "Day":
			sf.dayView.setVisible(true);
			sf.monthView.setVisible(false);
			sf.weekView.setVisible(false);
		}
	}
}
