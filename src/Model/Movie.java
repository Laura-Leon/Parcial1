package Model;

import processing.core.PApplet;

public class Movie extends Netflix {

	public Movie(int rating, String name, String year, String movie, PApplet app) {
		super(rating, name, year, movie, app);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void drawText(int posY, PApplet app) {
		// TODO Auto-generated method stub
		app.fill(255);
		app.text("Rating", 50, 45);
		app.text (this.rating, posX, posY);
		app.text("NAME", 100, 45);
		app.text (this.name, posX + 50, posY);
		app.text("YEAR", 190, 45);
		app.text (this.year, posX+ 150, posY);
		

		app.text("Key i Para A�o", 50, 600);
		app.text("Key p Para Rating", 50,615);
		app.text("Key o Para Nombre", 50, 630);
		
	}

}
