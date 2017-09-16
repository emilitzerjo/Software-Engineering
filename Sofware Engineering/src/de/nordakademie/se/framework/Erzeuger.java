package de.nordakademie.se.framework;

import java.util.Scanner;

/**
 * @author Emil Militzer
 *
 * Oberklasse für alle Erzeuger. Gibt Methoden vor, welche von den Unterklassen implementiert werden müssen
 */
public abstract class Erzeuger {
    /**
     * Fabrikmethode
     * Die Unterklassen müssen diese implementieren und den erzeugten Studenten zurückgeben.
     *
     * @return Konkreter Student
     */
    protected abstract Student erzeugeStudent();


    /**
     * Hier wird der Name des Studienganges zurückgegeben.
     *
     * @return Name des Studienganges
     */
    public abstract String getStudentenArt();


    /**
     * Hier werden die Stammdaten eines Studenten abgefragt und dem Studenten beigefügt.
     *
     * @return initialisierter Student
     */
    public Student erstelleStudent() {
        Scanner scanner = new Scanner(System.in);

        //Stammdaten einlesen
        System.out.print("Bitte Name eingeben:");
        String name = scanner.nextLine();
        System.out.print("Bitte Jahrgang eingeben:");
        int jahrgang = scanner.nextInt();

        //Student durch implementierung der Unterklasse erzeugen
        Student student = erzeugeStudent();

        //Stammdaten setzen
        student.setName(name);
        student.setJahrgang(jahrgang);
        return student;
    }


}
