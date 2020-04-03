package Model;

import java.util.Collections;
import java.util.LinkedList;

import Model.Netflix;

import processing.core.PApplet;

public class Logic {

	private String[] info,cargar;
	public PApplet app;
	private int rating;
	private LinkedList<Netflix> listNet;
	private String name,year,movie,serie;
	private Netflix [] net;
	
	
	public Logic(PApplet app) {
		this.app = app;
		this.listNet = new LinkedList<Netflix>();
		
		info = app.loadStrings("../data/netflix.txt");
		
		for (int i = 0; i < info.length; i++) {
			cargar = info[i].split(",");
			
			year = cargar[2];
			name = cargar[1];
			serie = cargar [4];
			movie = cargar [4];
			int rating = Integer.parseInt(cargar[3]);
			if(cargar[0].contentEquals("Serie")) {
				net[i] = new Serie(rating,name,year,serie,app);
			}else {
				net[i] = new Movie(rating,name,year,movie,app);
			}
			
		}
		}
		public void addListNet(int rating,String name, String year, String serie, PApplet app) {
			
	
	}	
			public void sortList(char c) {
				switch (c) { 
				case 'p': 
					Collections.sort(listNet) ;
					
				System.out.println("puntos");
					
					
					break;
				case 'o': 
					Collections.sort(listNet,new Name()) ;
					
				System.out.println("punt");
					
					
					break;
					
				case 'i': 
					Collections.sort(listNet,new Year()) ;
					
				System.out.println("pun");
					
					
					break;
		
	}
			}
			public LinkedList<Netflix> getListNet() {
				
				return listNet;
			}
			public void setListNet( LinkedList<Netflix>listNet) {
			
				this.listNet = listNet;
			}

	}
