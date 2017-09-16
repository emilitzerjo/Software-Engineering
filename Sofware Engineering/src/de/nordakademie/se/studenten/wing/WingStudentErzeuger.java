package de.nordakademie.se.studenten.wing;

import de.nordakademie.se.framework.Erzeuger;
import de.nordakademie.se.framework.Student;

import java.util.Scanner;

/**
 * @author Emil Militzer
 * <p>
 * Konkrete Implementierung für eine Wing-Student Erzeuger
 */
public class WingStudentErzeuger extends Erzeuger {

    /**
     * Erzeugt einen neuen Wing-Student
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
