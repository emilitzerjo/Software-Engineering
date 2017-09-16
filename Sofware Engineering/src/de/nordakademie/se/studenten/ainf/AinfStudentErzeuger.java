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
    public Student erzeugeStudent() {
        Scanner scanner = new Scanner(System.in);

        //Abfrage des besonderen Eigenschaft
        System.out.println("Programmiersprache(n) eingeben:");
        String programmiersprache = scanner.nextLine();

        AinfStudent ainfStudent = new AinfStudent(programmiersprache);

        return ainfStudent;
    }


    @Override
    public String getStudentenArt() {
        return "angewandte Informatik";
    }

}
