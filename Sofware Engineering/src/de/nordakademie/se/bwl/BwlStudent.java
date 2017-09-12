package de.nordakademie.se.bwl;

import de.nordakademie.se.framework.Student;

public class BwlStudent extends Student {

	private String golfplatz;

	@Override
	public String toString() {
		return "BWL-Stundent vong Geld her = " + super.toString() + " Golfplatz: "+golfplatz;
	}


	public String getGolfplatz() {
		return golfplatz;
	}
	public void setGolfplatz(String golfplatz) {
		this.golfplatz = golfplatz;
	}
	
}
