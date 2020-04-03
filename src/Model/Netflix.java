package Model;

import processing.core.PApplet;

public  class Netflix implements Comparable<Netflix>{
	private int id,posY;
	protected int posX;
	protected int rating;
	protected String year,tipo;
	protected String name;
	
	private String movie;
	protected PApplet app;
	
	
	
	public Netflix(int rating,String name, String year, String tipo, PApplet app) {
	this.year = year;
	this.name = name;
	this.rating = rating;
	this.tipo = tipo; 
	}
	
	public void drawText(int posY,PApplet app) {
		
		app.fill(255);
		app.text("Rating", 50, 45);
		app.text (this.rating, posX, posY);
		app.text("NAME", 100, 45);
		app.text (this.name, posX + 50, posY);
		app.text("YEAR", 190, 45);
		app.text (this.year, posX+ 150, posY);
		

		app.text("Key i Para Año", 50, 600);
		app.text("Key p Para Rating", 50,615);
		app.text("Key o Para Nombre", 50, 630);
	}
		
		
	
	
	
	@Override
	public int compareTo(Netflix arg0) {
		// TODO Auto-generated method stub
		return this.rating- arg0.getRating();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMovie() {
		return movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}
	

}
