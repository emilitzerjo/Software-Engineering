package de.nordakademie.se.erzeuger.konkreteerzeuger;

import de.nordakademie.se.erzeuger.Erzeuger;
import de.nordakademie.se.studenten.Student;
import de.nordakademie.se.studenten.konkretestudenten.WingStudent;

import java.util.Scanner;

/**
 * @author Emil Militzer
 * <p>
 * Konkrete Implementierung eines Erzeugers für Wing-Studenten
 */
public class WingStudentErzeuger extends Erzeuger {

    /**
     * Erzeugt und initialisiert einen neuen Wing-Student
     *
     * @return Wing-Student
     */
    @Override
    protected Student erzeugeKonkretenStudent() {
        Scanner scanner = new Scanner(System.in);

        //Abfrage von besonderen Eigenschaften
        System.out.println("Lieblingswerkzeug eingeben:");
        String lieblingswerkzeug = scanner.nextLine();
        System.out.println("Praktikumsstunden eingeben:");
        int praktikumsstunden = scanner.nextInt();

        return new WingStudent(lieblingswerkzeug, praktikumsstunden);
    }

    @Override
    public String getStudiengang() {
        return "Wirtschaftsingenieurwesen";
    }
}
