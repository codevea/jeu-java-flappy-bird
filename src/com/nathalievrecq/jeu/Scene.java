package com.nathalievrecq.jeu;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Scene extends JPanel {

	private ImageIcon icoBandeFond;
	private Image imgBandeFond;

	private final int LARGEUR_BANDE_FOND = 140;

	public int xFond;

	// Constructeur
	public Scene() {

		super();
		this.icoBandeFond = new ImageIcon(getClass().getResource("/images/bandeFondEcran.png"));
		this.imgBandeFond = this.icoBandeFond.getImage();

		this.xFond = 0; // Initialisation de la variable xFond
		// Flux indépendant -> Thread
		Thread chronoEcran = new Thread(new Chrono());
		chronoEcran.start();
	}

	// Méthodes
	private void deplacementFond(Graphics g) {

		if (this.xFond == -this.LARGEUR_BANDE_FOND) {
			this.xFond = 0;
		}

		// super.paintComponent(g);
		g.drawImage(this.imgBandeFond, this.xFond, 0, null);
		g.drawImage(this.imgBandeFond, this.xFond + this.LARGEUR_BANDE_FOND, 0, null);
		g.drawImage(this.imgBandeFond, this.xFond + this.LARGEUR_BANDE_FOND * 2, 0, null);
		g.drawImage(this.imgBandeFond, this.xFond + this.LARGEUR_BANDE_FOND * 3, 0, null);
	}

	public void paintComponent(Graphics g) {

		this.deplacementFond(g);
	}
}
