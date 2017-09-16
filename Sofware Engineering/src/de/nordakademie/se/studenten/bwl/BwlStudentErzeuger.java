package de.nordakademie.se.studenten.bwl;

import de.nordakademie.se.framework.Erzeuger;
import de.nordakademie.se.framework.Student;

import java.util.Scanner;

/**
 * @author Emil Militzer
 * <p>
 * Konkrete Implemtierung eines Erzeugers für BWL Studenten.
 */
public class BwlStudentErzeuger extends Erzeuger {

    /**
     * Erzeugt und initialisiert BWL Student
     *
     * @return BWL Student
     */
    @Override
    protected Student erzeugeStudent() {
        Scanner scanner = new Scanner(System.in);
        //Abfrage der besonderen Eigenschaft.
        System.out.println("Lieblingsgolfplatz eingeben:");
        String golfplatz = scanner.nextLine();

        BwlStudent bwlStudent = new BwlStudent(golfplatz);

        return bwlStudent;
    }


    @Override
    public String getStudentenArt() {
        return "BWL";
    }

}
