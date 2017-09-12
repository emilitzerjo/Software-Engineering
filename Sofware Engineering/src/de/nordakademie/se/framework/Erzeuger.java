package de.nordakademie.se.framework;

import java.util.Scanner;

public abstract class Erzeuger {
	
	protected abstract Student erzeugeStudent();
	
	public abstract String getStudentenArt();

	public Student erstelleStudent(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bitte Name eingeben:");
		String name = scanner.nextLine();
		
		Student student = erzeugeStudent();
		student.setName(name);
		return student;
	}
	

	
}
