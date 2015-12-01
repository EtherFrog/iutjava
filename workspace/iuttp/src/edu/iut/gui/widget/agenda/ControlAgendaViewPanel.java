package edu.iut.gui.widget.agenda;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ControlAgendaViewPanel extends JPanel {

	CardLayout agendaViewLayout;
	JPanel contentPane;
	int selectedYear;
	int selectedMonth;
	int selectedDay;
	public int getSelectedYear() {
		return selectedYear;
	}

	public int getSelectedMonth() {
		return selectedMonth;
	}

	public int getSelectedDay() {
		return selectedDay;
	}
	
	public ControlAgendaViewPanel(CardLayout layerLayout, final JPanel contentPane) {
		this.agendaViewLayout = layerLayout;
		this.contentPane = contentPane;
		JButton nextView = new JButton("Next");
		nextView.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				agendaViewLayout.next(contentPane);				
			}
			
		});
		this.add(nextView);
		
	}
	
}
