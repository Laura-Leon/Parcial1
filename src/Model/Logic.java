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
	private String name,year,movie,serie,tipo;
	private Netflix [] net;
	
	
	public Logic(PApplet app) {
		this.app = app;
		this.listNet = new LinkedList<Netflix>();
		
		info = app.loadStrings("../data/netflix.txt");
		
		for (int i = 0; i < info.length; i++) {
			cargar = info[i].split(",");
			
			year = cargar[2];
			name = cargar[1];
			
			int rating = Integer.parseInt(cargar[2]);
			
			listNet.add(new Netflix(rating,name,year,tipo,app));
			
		}
		}
		public void addListNet(int rating,String name, String year, String tipo, PApplet app) {
			listNet.add(new Netflix(rating,name,year, tipo,app));
	
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
