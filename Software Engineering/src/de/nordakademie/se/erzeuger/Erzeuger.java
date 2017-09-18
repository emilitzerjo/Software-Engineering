package de.nordakademie.se.erzeuger;

import de.nordakademie.se.studenten.Student;
import de.nordakademie.se.util.Konsole;

/**
 * @author Paul Konopik
 * <p>
 * Oberklasse für alle Erzeuger. Gibt Methoden vor, welche von den Unterklassen implementiert werden müssen
 */
public abstract class Erzeuger {
    /**
     * Fabrikmethode
     * Die Unterklassen müssen diese implementieren und den erzeugten Studenten zurückgeben.
     *
     * @return Konkreter Student
     */
    protected abstract Student erzeugeKonkretenStudent();

    /**
     * Hier wird der Name des Studienganges zurückgegeben.
     *
     * @return Name des Studienganges
     */
    public abstract String getStudiengang();

    /**
     * Hier werden die Stammdaten eines Studenten abgefragt und dem Studenten beigefügt.
     *
     * @return initialisierter Student
     */
    public Student erzeugeStudent() {

        //Stammdaten einlesen
        System.out.print("Bitte Name eingeben:");
        String name = Konsole.readString();
        System.out.print("Bitte Jahrgang eingeben:");
        int jahrgang = Konsole.readInt();

        //Student durch Implementierung der Unterklasse erzeugen
        Student student = erzeugeKonkretenStudent();

        //Stammdaten setzen
        student.setName(name);
        student.setJahrgang(jahrgang);
        return student;
    }
}
