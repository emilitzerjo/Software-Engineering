package de.nordakademie.se.bwl;

import java.util.Scanner;

import de.nordakademie.se.framework.Erzeuger;
import de.nordakademie.se.framework.Student;

public class BwlStudentErzeuger extends Erzeuger {

	@Override
	public Student erzeugeStudent() {
		Scanner scanner =  new Scanner(System.in);
		System.out.println("Lieblingsgolfplatz eingeben:");
		String golfplatz = scanner.nextLine();
		
		BwlStudent bwlStudent = new BwlStudent();
		bwlStudent.setGolfplatz(golfplatz);
		return bwlStudent;
	}

	
	@Override
	public String getStudentenArt() {
		return "BWL";
	}

}
