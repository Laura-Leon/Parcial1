package View;

import Controller.GameController;
import processing.core.PApplet;

public class Main extends PApplet {
	private GameController controller;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("View.Main");
	}
	public void settings() {
		size(600,700);
		
	}

	public void setup() {
		controller = new GameController(this);
	}

	public void draw() {
		background(0);
	
		
		for (int i = 0; i < controller.listNet().size(); i++) {
			controller.listNet().get(i).drawText((i*(50))+ 80, this);
		}
		
	}

	
	
	public void keyPressed() {
		controller.sortList(key);
		
	}
}

