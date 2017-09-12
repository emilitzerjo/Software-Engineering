package de.nordakademie.se;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import de.nordakademie.se.framework.Erzeuger;
import de.nordakademie.se.framework.Student;

public class Studentenverwaltung {
	
	private Erzeuger[] creators;
	private List<Student> studenten;
	
	public Studentenverwaltung(Erzeuger... creators) {
		super();
		this.creators = creators;
		this.studenten = new ArrayList<>();
	}
	
	
	private void registriereNeuenStudent(){
		Scanner scanner = new Scanner(System.in);
		
		int type =-1;
		while(type < 0 || type>=creators.length){
			for (int i = 0; i < creators.length; i++) {
				System.out.println(i+")"+creators[i].getStudentenArt());
			}
			System.out.print("Wähle Studentenart aus:");
			type = scanner.nextInt();
		}
		studenten.add(creators[type].erstelleStudent());
	}
	
	private void zeigeAlleStudenten(){
		for (Student student : studenten) {
			System.out.println(student);
		}
	}
	
	public void start(){
		int auswahl;
		do{
			System.out.println("Herzlich Willkommen zur Studentenverwaltung");
			System.out.println("0) Verlassen");
			System.out.println("1) neuen Student registrieren");
			System.out.println("2) alle Studenten anzeigen");
			Scanner scanner = new Scanner(System.in);
			auswahl = scanner.nextInt();
			switch (auswahl) {
			case 0 : break;
			case 1:
				registriereNeuenStudent();
				break;
			case 2: zeigeAlleStudenten();break;
			default:
				System.out.println("Unbekannter Eingabewert! Bitte erneut versuchen!");
				break;
			}
		}while(auswahl !=0);
	}
	

}
