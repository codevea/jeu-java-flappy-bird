package com.nathalievrecq.jeu;

public class Chrono implements Runnable {

	private final int PAUSE = 15; // Réglage de la vitesse.

	@Override
	public void run() {

		while (true) {

			Main.scene.xFond--;
			Main.scene.repaint();

			try {
				Thread.sleep(this.PAUSE);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
			}
		}
	}
}
