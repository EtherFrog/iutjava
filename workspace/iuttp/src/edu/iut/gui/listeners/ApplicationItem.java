package edu.iut.gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iut.gui.frames.SchedulerFrame;

//Classe qui permet d'ecouter et de lancer les evenements de chaque item
 
public class ApplicationItem implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		if(evt.getSource()== SchedulerFrame.month) {
			SchedulerFrame.monthView.setVisible(true);
			SchedulerFrame.weekView.setVisible(false);
			SchedulerFrame.dayView.setVisible(false);
		}
		if(evt.getSource()== SchedulerFrame.week) {
			SchedulerFrame.weekView.setVisible(true);
			SchedulerFrame.dayView.setVisible(false);
			SchedulerFrame.monthView.setVisible(false);
		}
		if(evt.getSource()== SchedulerFrame.day) {
			SchedulerFrame.dayView.setVisible(true);
			SchedulerFrame.monthView.setVisible(false);
			SchedulerFrame.weekView.setVisible(false);
		}
	}
	
}
