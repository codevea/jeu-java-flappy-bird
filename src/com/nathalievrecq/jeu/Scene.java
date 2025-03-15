package com.nathalievrecq.jeu;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import com.nathalievrecq.objets.Tuyau;

public class Scene extends JPanel {

	private ImageIcon icoBandeFond;
	private Image imgBandeFond;
	
	// Tuyaux
	public Tuyau tuyauHaut1;
	public Tuyau tuyauBas1;
	
	public Tuyau tuyauHaut2;
	public Tuyau tuyauBas2;
	
	public Tuyau tuyauHaut3;
	public Tuyau tuyauBas3;
	
	// Constantes
	private final int LARGEUR_BANDE_FOND = 140;
	private final int DISTANCES_TUYAUX = 250;
	private final int ECART_TUYAUX = 120;
	

	public int xFond;
	// Variable gestion du déplacement des tuyaux
	private int dxTuyaux;
	// Variable gestion de la position sur l'écran.
	private int xTuyaux;

	// Constructeur
	public Scene() {

		super();
		this.icoBandeFond = new ImageIcon(getClass().getResource("/images/bandeFondEcran.png"));
		this.imgBandeFond = this.icoBandeFond.getImage();

		this.xFond = 0; // Initialisation de la variable xFond
		this.xTuyaux = 100;
		this.dxTuyaux = 0;
		
		this.tuyauHaut1 = new Tuyau(this.xTuyaux, -150, "/images/tuyauHaut.png");
		this.tuyauBas1 = new Tuyau(this.xTuyaux, 250, "/images/tuyauBas.png");
		
		this.tuyauHaut2 = new Tuyau(this.xTuyaux + this.tuyauBas1.getLargeur() + this.ECART_TUYAUX, -150, "/images/tuyauHaut.png");
		this.tuyauBas2 = new Tuyau(this.xTuyaux + this.tuyauHaut1.getLargeur() + this.ECART_TUYAUX, 250, "/images/tuyauBas.png");
		
		this.tuyauHaut3 = new Tuyau(this.xTuyaux + (this.tuyauBas2.getLargeur() + this.ECART_TUYAUX * 2), -150, "/images/tuyauHaut.png");
		this.tuyauBas3 = new Tuyau(this.xTuyaux + (this.tuyauHaut2.getLargeur() + this.ECART_TUYAUX * 2), 250, "/images/tuyauBas.png");
		
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
