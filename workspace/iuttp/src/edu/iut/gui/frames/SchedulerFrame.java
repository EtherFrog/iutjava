package edu.iut.gui.frames;

import java.awt.CardLayout;
import java.awt.Component;
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

import edu.iut.gui.listeners.AbstractApplicationMessageDialog;
import edu.iut.gui.listeners.ApplicationInfoMessageDialog;
import edu.iut.gui.listeners.ApplicationItem;
import edu.iut.gui.widget.agenda.AgendaPanelFactory;
import edu.iut.gui.widget.agenda.ControlAgendaViewPanel;
import edu.iut.gui.widget.agenda.AgendaPanelFactory.ActiveView;

/**
 * 
 * 
 *
 */
public class SchedulerFrame extends JFrame {
	JPanel contentPane;
	CardLayout layerLayout;
	AgendaPanelFactory agendaPanelFactory;
	public static JPanel dayView;
	public static JPanel weekView;
	public static JPanel monthView;
	// item du menu File
	public static JMenuItem load, save, quit;
	// item du menu View qui est le sous-menu du menu Edit
	public static JMenuItem month, week, day;
	// item du menu Help
	public static JMenuItem display, about;

	/**
	 * génère le menu et ainsi que son positionement dans la fenetre
	 */

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

		// Declaration de la barre de menus
		JMenuBar menuBar = new JMenuBar();
		JMenu menu, submenu;

			/* File Menu */
		
		// Le premier menu
		menu = new JMenu("File");
		menuBar.add(menu);

		// les items du menu file
		load = new JMenuItem("Load");
		menu.add(load);
		// Evenement de l'item Load
		MessageDiagInfo(load);
		save = new JMenuItem("Save");
		menu.add(save);
		// Evenement de l'item Save
		MessageDiagInfo(save);
		menu.addSeparator();
		quit = new JMenuItem("Quit");
		menu.add(quit);
		MessageDiagInfo(quit);
		/*IApplicationLogListener.newMessage("0",
				"La fonctionalité n'est pas encore implémenter");
		msgInfo.showMessage("0",
				"La fonctionalité n'est pas encore implémenter");
		quit.addActionListener(msgInfo);
		 */
			/* Edit Menu */
		
		// Le deuxieme menu
		menu = new JMenu("Edit");
		menuBar.add(menu);
		// les items du menu Edit
		submenu = new JMenu("View");
		// les sous menu
		// Creation de l'item Month
		month = new JMenuItem("Month");
		submenu.add(month);
		// Evenement de l'item Day
		month.addActionListener(new ApplicationItem());
		// Creation de l'item Week
		week = new JMenuItem("Week");
		submenu.add(week);
		// Evenement de l'item Week
		week.addActionListener(new ApplicationItem());
		// Creation de l'item Day
		day = new JMenuItem("Day");
		submenu.add(day);
		// Evenement de l'item Day
		day.addActionListener(new ApplicationItem());
		// Ajout du sous-menu au menu Edit
		menu.add(submenu);

			/* Help Menu */
		
		// Le troisieme menu
		menu = new JMenu("Help");
		menuBar.add(menu);
		// Creation de l'item Display
		display = new JMenuItem("Display");
		menu.add(display);
		// Evenement de l'item Display
		MessageDiagInfo(display);
		display.addActionListener(new ApplicationItem());
		// Creation de l'item About
		about = new JMenuItem("About");
		menu.add(about);
		// Evenement de l'item About
		MessageDiagInfo(about);
		about.addActionListener(new ApplicationItem());

		this.setJMenuBar(menuBar);
		this.pack();
		layerLayout.next(contentPane);

	}

	public void MessageDiagInfo(JMenuItem j) {
		j.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog((Component) e.getSource(),
						"La fonctionalité n'est pas encore implémenter");
			}
		});
	}

	class AgendaView implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			layerLayout.next(contentPane);
		}
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

	/**
	 * Constructeur prenant le titre de la fenetre en parametre
	 * 
	 * @param title
	 */

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
