package app;

import java.awt.*;
import java.util.ArrayList;

import constructor.ItemConstructor;
import constructor.UnitConstructor;
import entity.*;
import handler.Start;
import handler.Town;

import javax.swing.*;

public class Main {

	//Frame 생성
	JFrame window;
	Container con;
	//제목
	JPanel titleNamePanel;
	//시작 버튼
	JPanel startButtonPanel;

	//제목 Label 생성
	JLabel titleNameLabel;
	//시작 버튼 Label 생성
	JLabel startButtonLabel;
	//시작 Button 생성
	JButton startButton;

	//제목 Font 지정
	Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);
	//시작 Font 지정
	Font startFont = new Font("Times New Roman", Font.PLAIN, 50);

	Start s = new Start();
	Human player = null;
	ItemConstructor i = new ItemConstructor();
	UnitConstructor u = new UnitConstructor();

	ArrayList<Weapon> weapon = null;
	ArrayList<Helmet> helmet = null;
	ArrayList<Body> body = null;
	ArrayList<Legs> legs = null;
	ArrayList<Gloves> glove = null;
	ArrayList<Ring> ring = null;

	ArrayList<Potion> potion = null;

	ArrayList<Monster> monster = null;
	
	public Main() {

		//JFrame 기본 설정
		window = new JFrame();
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.BLACK);
		window.setLayout(null);
		window.setVisible(true);

		//JFrame 생성시 JFrame이 지니고 있는 container를 사용 하겠다고 생성
		con = window.getContentPane();

		//제목 Panel 생성
		titleNamePanel = new JPanel();
		titleNamePanel.setBounds(100, 100, 600, 150);
		titleNamePanel.setBackground(Color.BLACK);
		//Panel 안에 들어갈 문구 (Label) 생성
		titleNameLabel = new JLabel("Runescape");
		titleNameLabel.setForeground(Color.white);
		titleNameLabel.setFont(titleFont); //위에 지정 해놓은 font로 설정
		titleNamePanel.add(titleNameLabel);
		con.add(titleNamePanel);

		//시작 버늩 Panel 생성
		startButtonPanel = new JPanel();
		startButtonPanel.setBounds(100, 400, 600, 100);
		startButtonPanel.setBackground(Color.BLACK);
		startButton = new JButton();
		startButtonLabel = new JLabel("Start");
		startButtonLabel.setFont(startFont);
		startButton.add(startButtonLabel);
		startButtonPanel.add(startButton);
		con.add(startButtonPanel);

		player = s.characterSettings();
		weapon = i.initWeapons();
		potion = i.initPotions();
		helmet = i.initHelmets();
		body = i.initBody();
		legs = i.initLegs();
		glove = i.initGloves();
		ring = i.initRing();

		monster = u.initMonsters();
		Town t = new Town(player, weapon, potion, monster, helmet, body, legs, glove, ring);
		t.town();
	}

	public static void main(String[] args) {
		new Main();
	}
}
