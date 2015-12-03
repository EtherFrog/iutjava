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
import javax.swing.SpinnerNumberModel;

public class ControlAgendaViewPanel extends JPanel {

	CardLayout agendaViewLayout;
	JPanel contentPane;
	int selectedYear;
	int selectedMonth;
	int selectedDay;
	/**
	 * Accesseur pour recuperer l'attribut selectedYear
	 * @return selectedYear
	 */
	public int getSelectedYear() {
		return selectedYear;
	}
	/**
	 * Accesseur pour recuperer l'attribut selectedMonth
	 * @return selectedMonth
	 */
	public int getSelectedMonth() {
		return selectedMonth;
	}
	/**
	 * Accesseur pour recuperer l'attribut selectedDay
	 * @return
	 */
	public int getSelectedDay() {
		return selectedDay;
	}
	/**
	 * Constructeur de la classe ControlAgendaViewPanel
	 * @param layerLayout
	 * @param contentPane
	 */
	public ControlAgendaViewPanel(CardLayout layerLayout, final JPanel contentPane) {
		this.agendaViewLayout = layerLayout;
		this.contentPane = contentPane;
		Calendar c = Calendar.getInstance(Locale.getDefault());
		this.selectedYear=c.get(Calendar.YEAR);
		this.selectedMonth=c.get(Calendar.MONTH);
		this.selectedDay=c.get(Calendar.DATE);
		SpinnerNumberModel spinnerYear = new SpinnerNumberModel(selectedYear,selectedYear- 5,selectedYear + 5, 1);
		JSpinner year = new JSpinner(spinnerYear);

		String[] month ={"January","February","March","April","May","June","July","August","September","October","November","December"} ;
		JComboBox monthCombo = new JComboBox(month);
		
		String[] day = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
		JComboBox dayCombo = new JComboBox(day);

		monthCombo.setSelectedIndex(selectedMonth);
		dayCombo.setSelectedIndex(selectedDay);
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		panel2.setLayout(new BorderLayout());
		panel1.setLayout(new GridLayout(1,3));
		panel1.add(dayCombo);
		panel1.add(monthCombo);
		panel1.add(year);

		panel2.add(panel1,BorderLayout.WEST);
		contentPane.add(panel2,BorderLayout.PAGE_START);
	
		
	}
	
}
