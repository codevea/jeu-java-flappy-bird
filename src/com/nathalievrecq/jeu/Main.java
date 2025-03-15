package com.nathalievrecq.jeu;

import javax.swing.JFrame;

public class Main {

	public static JFrame fenetre;
	
	public static Scene scene;

	public static void main(String[] args) {

		fenetre = new JFrame("Flappy Bird");
		scene = new Scene();

		// Caractéristiques de la fenêtre :
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ferme la fenêtre.
		fenetre.setSize(300, 400); // Dimension de la fenêtre.
		fenetre.setLocationRelativeTo(null); // Centre la fenêtre à l'écran.
		fenetre.setResizable(false); // Empêcher le redimensionnement de la fenêtre.
		fenetre.setAlwaysOnTop(true); // Empêcher la fenêtre de passer en-dessous.
		
		fenetre.setContentPane(scene);
		fenetre.setVisible(true); // Visibilité de la fenêtre.
	}
}
