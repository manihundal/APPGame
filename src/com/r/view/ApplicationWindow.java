package com.r.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

//simport org.jgraph.JGraph;

import com.r.controller.AddContinent;
import com.r.controller.AddCountry;
import com.r.controller.CreateMap;
import com.r.controller.EndReinforcementPhase;
import com.r.controller.ExchangeCards;
import com.r.controller.NumberOfPlayers;
import com.r.controller.OpenListener;
import com.r.controller.PlaceArmies;

import com.r.controller.RemoveContinent;
import com.r.controller.RemoveCountry;
import com.r.controller.SaveListener;
import com.r.controller.ShowPlayer;
import com.r.controller.ShowPlayerCountries;
import com.r.utility.StaticVariables;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;

import java.awt.GridLayout;
import javax.swing.JLabel;

/**
 * This class represents the main window of our game.  All event handlers registered to components
 * (menu items) of this class are instantiated with a reference to this class.
 * author Raghav verma
 * version 1.0
 */
public class ApplicationWindow extends JFrame {

	public ApplicationWindow() {
		getContentPane().setLayout(new BorderLayout(0, 0));
		getContentPane().setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 13));
		getContentPane().setBackground(Color.LIGHT_GRAY);
		

		 
	}

	private JMenuBar menuBar;
	private static ApplicationWindow instance = null;
	private JMenu GameMenu;

	private JMenu fileMenu;
	private JMenu editMenu;
	private JMenu playMenu;

	private JMenu helpMenu;
	private JMenuItem open;
	private JMenuItem save;
	private JMenuItem placearmiesoncountry;
	private JMenuItem addContinent;
	private JMenuItem addCountry;
	private JMenuItem removeContinent;
	private JMenuItem endreinforcementphase;
	private JMenuItem removeCountry;
	private JMenuItem showplayercountries;
	private JMenuItem addPlayer;
	private JMenuItem ExchangeCardsforplayer;
	private JMenuItem createMap;
	private JMenuItem ShowCurrentPlayer;
	private JMenuItem numberofplayers;
	private JMenuItem startgame;
	private JMenuItem help;
	private JMenuItem start, pause;

	public static ApplicationWindow getInstance() {
		if (instance == null) {
			instance = new ApplicationWindow();
		}
		return instance;
	}

	/**
	 * Returns the singleton instance of GraphicalUserInterface
	 * 
	 * @return
	 */
	public void open() {
		// CREATING FRAME and Setting
		JFrame mainFrame = new JFrame("Risk Game");
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		// Uses the specific input screen of the user
		StaticVariables.SCREEN_WIDTH = (int) (dim.width * 0.9);
		StaticVariables.SCREEN_HEIGHT = (int) (dim.height * 0.9);
		mainFrame.setSize(StaticVariables.SCREEN_WIDTH, StaticVariables.SCREEN_HEIGHT);
		mainFrame.setLocation(dim.width / 2 - StaticVariables.SCREEN_WIDTH / 2,
				dim.height / 2 - StaticVariables.SCREEN_HEIGHT / 2);
		mainFrame.getContentPane().setLayout(new FlowLayout());
		final JLabel backGround = new JLabel(new ImageIcon(
				((new ImageIcon("images/Conquest.jpg").getImage().getScaledInstance(mainFrame.getSize().width,
						(int) ((int) mainFrame.getSize().height - 30), java.awt.Image.SCALE_SMOOTH)))));
		mainFrame.add(backGround);
		menuBar = new JMenuBar();
		menuBar.setBackground(Color.LIGHT_GRAY);
		fileMenu = new JMenu("File");
		fileMenu.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 13));
		editMenu = new JMenu("Edit");
		editMenu.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 13));
		GameMenu = new JMenu("Game");
		GameMenu.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 13));
		helpMenu = new JMenu("Help");
		helpMenu.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 13));
		playMenu = new JMenu("Play");
		playMenu.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 13));

		open = new JMenuItem("Open");
		save = new JMenuItem("Save to file");
		addContinent = new JMenuItem("Add Continent");
		addCountry = new JMenuItem("Add  Country");
		removeContinent = new JMenuItem("Remove Continent");
		removeCountry = new JMenuItem("Remove Country");
		showplayercountries = new JMenuItem("Show Player Countries");
		numberofplayers = new JMenuItem(" Start Game");
		endreinforcementphase = new JMenuItem("End reinforcement phase");
		createMap = new JMenuItem("Create Map");
		ShowCurrentPlayer = new JMenuItem("Show Current Player");
		placearmiesoncountry = new JMenuItem("Place Armies On Country");
		placearmiesoncountry = new JMenuItem("Place Armies On Country");
		ExchangeCardsforplayer = new JMenuItem("Exchange Cards");
		/*
		 * Create the menu items for the simulation menu.
		 */
		help = new JMenuItem("Help");
		start = new JMenuItem("Start");
		pause = new JMenuItem("Pause");

		fileMenu.add(open);
		fileMenu.addSeparator();
		fileMenu.add(save);
		fileMenu.add(createMap);

		editMenu.add(addContinent);
		editMenu.add(removeContinent);
		editMenu.addSeparator();
		editMenu.add(addCountry);
		editMenu.add(removeCountry);
		GameMenu.add(numberofplayers);
		GameMenu.add(ShowCurrentPlayer);
		GameMenu.add(showplayercountries);
		GameMenu.add(endreinforcementphase);
		GameMenu.add(ExchangeCardsforplayer);
		playMenu.add(placearmiesoncountry);
		helpMenu.add(help);
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(GameMenu);
		menuBar.add(playMenu);
		menuBar.add(helpMenu);
		open.addActionListener(new OpenListener());
		addContinent.addActionListener(new AddContinent());
		removeContinent.addActionListener(new RemoveContinent());
		addCountry.addActionListener(new AddCountry());
		removeCountry.addActionListener(new RemoveCountry());
		save.addActionListener(new SaveListener());
		ShowCurrentPlayer.addActionListener(new ShowPlayer());
		numberofplayers.addActionListener(new NumberOfPlayers());
		createMap.addActionListener(new CreateMap());
		showplayercountries.addActionListener(new ShowPlayerCountries());
		placearmiesoncountry.addActionListener(new PlaceArmies());
		endreinforcementphase.addActionListener(new EndReinforcementPhase());
		ExchangeCardsforplayer.addActionListener(new ExchangeCards());
		mainFrame.setJMenuBar(menuBar);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);
	}
}