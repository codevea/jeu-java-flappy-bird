package com.nathalievrecq.jeu;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Scene extends JPanel {

	private ImageIcon icoBandeFond;
	private Image imgBandeFond;
	
	private final int LARGEUR_BANDE_FOND = 140;
	
	// Constructeur
	public Scene() {
		
		super();
		this.icoBandeFond = new ImageIcon(getClass().getResource("/images/bandeFondEcran.png"));
		this.imgBandeFond = this.icoBandeFond.getImage();
	}
	
	// Méthode
	public void paintComponent(Graphics g) {
		
		//super.paintComponent(g);
		g.drawImage(this.imgBandeFond, 0, 0, null);
		g.drawImage(this.imgBandeFond, this.LARGEUR_BANDE_FOND, 0, null);
	}
}
