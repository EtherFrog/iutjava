package edu.iut.gui.widget.agenda;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

import edu.iut.app.ApplicationSession;

public class ControlAgendaViewPanel extends JPanel implements ActionListener {

	CardLayout agendaViewLayout;
	JPanel contentPane;
	int selectedYear;
	int selectedMonth;
	int selectedDay;

	/**
	 * Accesseur pour recuperer l'attribut selectedYear
	 * 
	 * @return selectedYear
	 */
	public int getSelectedYear() {
		return selectedYear;
	}

	/**
	 * Accesseur pour recuperer l'attribut selectedMonth
	 * 
	 * @return selectedMonth
	 */
	public int getSelectedMonth() {
		return selectedMonth;
	}

	/**
	 * Accesseur pour recuperer l'attribut selectedDay
	 * 
	 * @return
	 */
	public int getSelectedDay() {
		return selectedDay;
	}

	/**
	 * Constructeur de la classe ControlAgendaViewPanel
	 * 
	 * @param layerLayout
	 * @param contentPane
	 */
	public ControlAgendaViewPanel(CardLayout layerLayout,
			final JPanel contentPane) {
		this.agendaViewLayout = layerLayout;
		this.contentPane = contentPane;
		/*
		 * JSpinner year= new JSpinner(new SpinnerNumberModel(2015, 2010, 2020,
		 * 1)); add(year); JComboBox<String> month= new JComboBox<String>
		 * (ApplicationSession.instance().getMonths()); add(month);
		 * JComboBox<String> day= new JComboBox<String>
		 * (ApplicationSession.instance().getDays()); add(day); JButton
		 * Create=new JButton("Create an exam"); creer.addActionListener(this);
		 * JButton Delete=new JButton("Delete an exam"); add(Create);
		 * add(Delete);
		 */
		/*
		 * JPanel panel1 = new JPanel(); JPanel panel2 = new JPanel();
		 * 
		 * panel2.setLayout(new BorderLayout()); panel1.setLayout(new
		 * GridLayout(1,3)); panel1.add(day); panel1.add(month);
		 * panel1.add(year); panel2.add(panel1,BorderLayout.WEST);
		 * contentPane.add(panel2,BorderLayout.PAGE_START);
		 */
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

}
