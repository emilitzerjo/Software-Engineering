package de.nordakademie.se;

import de.nordakademie.se.ainf.AinfStudentErzeuger;
import de.nordakademie.se.bwl.BwlStudentErzeuger;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Studentenverwaltung studentenverwaltung = new Studentenverwaltung(new AinfStudentErzeuger(),
				new BwlStudentErzeuger());
		studentenverwaltung.start();
	}
}
