package de.nordakademie.se.studenten.ainf;

import de.nordakademie.se.framework.Erzeuger;
import de.nordakademie.se.framework.Student;

import java.util.Scanner;

/**
 * @author Emil Militzer
 * <p>
 * Konkrete Implementierung eines Ainf-Studenten Erzeugers
 */
public class AinfStudentErzeuger extends Erzeuger {

    /**
     * Erstellt einen neuen AinfStudent
     *
     * @return AinfStudent
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
        return "angewandte Informatik";
    }

}
