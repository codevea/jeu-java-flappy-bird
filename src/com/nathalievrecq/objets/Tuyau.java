package com.nathalievrecq.objets;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Tuyau {

	private int largeur;
	private int hauteur;
	private int x;
	private int y;
	private String strImage;
	private ImageIcon icoTuyau;
	private Image imgTuyau;

	public Tuyau(int x, int y, String strImage) {

		this.largeur = 50;
		this.hauteur = 300;
		this.x = x;
		this.y = y;
		this.strImage = strImage;

		this.icoTuyau = new ImageIcon(getClass().getResource(this.strImage));
		this.imgTuyau = this.icoTuyau.getImage();
	}

	// Getters
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getLargeur() {
		return largeur;
	}

	public int getHauteur() {
		return hauteur;
	}

	public Image getImgTuyau() {
		return imgTuyau;
	}

	// Setters
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
}
