package de.nordakademie.se.ainf;

import java.util.Scanner;

import de.nordakademie.se.framework.Erzeuger;
import de.nordakademie.se.framework.Student;

public class AinfStudentErzeuger extends Erzeuger {

	@Override
	public Student erzeugeStudent() {
		Scanner scanner =  new Scanner(System.in);
		System.out.println("Programmiersprache(n) eingeben:");
		String programmiersprache = scanner.nextLine();
		
		AinfStudent ainfStudent = new AinfStudent();
		ainfStudent.setProgrammiersprache(programmiersprache);
		return ainfStudent;
	}

	
	@Override
	public String getStudentenArt() {
		return "angewandte Informatik";
	}

}
