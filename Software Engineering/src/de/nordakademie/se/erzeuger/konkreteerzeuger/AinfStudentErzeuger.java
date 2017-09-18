package de.nordakademie.se.erzeuger.konkreteerzeuger;

import de.nordakademie.se.erzeuger.Erzeuger;
import de.nordakademie.se.studenten.konkretestudenten.AinfStudent;
import de.nordakademie.se.studenten.Student;

import java.util.Scanner;

/**
 * @author Emil Militzer
 * <p>
 * Konkrete Implementierung eines Erzeugers für Ainf-Studenten
 */
public class AinfStudentErzeuger extends Erzeuger {

    /**
     * Erzeugt und initialisiert einen neuen Ainf-Student
     *
     * @return Ainf-Student
     */
    @Override
    protected Student erzeugeKonkretenStudent() {
        Scanner scanner = new Scanner(System.in);

        //Abfrage des besonderen Eigenschaft
        System.out.println("Programmiersprache(n) eingeben:");
        String programmiersprache = scanner.nextLine();

        return new AinfStudent(programmiersprache);
    }

    @Override
    public String getStudiengang() {
        return "Angewandte Informatik";
    }
}
