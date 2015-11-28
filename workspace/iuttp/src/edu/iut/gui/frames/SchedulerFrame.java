package edu.iut.gui.frames;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.KeyStroke;

import edu.iut.gui.widget.agenda.AgendaPanelFactory;
import edu.iut.gui.widget.agenda.ControlAgendaViewPanel;
import edu.iut.gui.widget.agenda.AgendaPanelFactory.ActiveView;

public class SchedulerFrame extends JFrame {
	JPanel contentPane;
	CardLayout layerLayout;
	AgendaPanelFactory agendaPanelFactory;
	JPanel dayView;
	JPanel weekView;
	JPanel monthView;

	protected void setupUI() {

		contentPane = new JPanel();
		layerLayout = new CardLayout();
		contentPane.setLayout(layerLayout);
		ControlAgendaViewPanel agendaViewPanel = new ControlAgendaViewPanel(
				layerLayout, contentPane);
		agendaPanelFactory = new AgendaPanelFactory();
		dayView = agendaPanelFactory.getAgendaView(ActiveView.DAY_VIEW);
		weekView = agendaPanelFactory.getAgendaView(ActiveView.WEEK_VIEW);
		monthView = agendaPanelFactory.getAgendaView(ActiveView.MONTH_VIEW);

		contentPane.add(dayView, ActiveView.DAY_VIEW.name());
		contentPane.add(weekView, ActiveView.WEEK_VIEW.name());
		contentPane.add(monthView, ActiveView.MONTH_VIEW.name());

		JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
				agendaViewPanel, contentPane);
		this.setContentPane(splitPane);

		JMenuBar menuBar = new JMenuBar();
		JMenu menu, submenu;
		JMenuItem menuItem;

		/* File Menu */
		// Le premier menu
		menu = new JMenu("File");
		menuBar.add(menu);

		// les items du menu file
		menuItem = new JMenuItem("Load");
		menu.add(menuItem);
		menuItem = new JMenuItem("Save");
		menu.add(menuItem);
		menu.addSeparator();
		menuItem = new JMenuItem("Quit");
		menu.add(menuItem);

		// Le deuxieme menu
		menu = new JMenu("Edit");
		menuBar.add(menu);

		// les items du menu Edit
		submenu = new JMenu("View");
		// les sous menu
		menuItem = new JMenuItem("Month");
		submenu.add(menuItem);
		menuItem = new JMenuItem("Week");
		submenu.add(menuItem);
		menuItem = new JMenuItem("Day");
		submenu.add(menuItem);
		menu.add(submenu);

		// Le deuxieme menu
		menu = new JMenu("Help");
		menuBar.add(menu);
		menuItem = new JMenuItem("Display");
		menu.add(menuItem);
		menuItem = new JMenuItem("About");
		menu.add(menuItem);
		
		this.setJMenuBar(menuBar);
		this.pack();
		layerLayout.next(contentPane);
	}

	public SchedulerFrame() {
		super();

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		contentPane = null;
		dayView = null;
		weekView = null;
		monthView = null;
		agendaPanelFactory = null;
		setupUI();

	}

	public SchedulerFrame(String title) {
		super(title);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setupUI();
	}

}
