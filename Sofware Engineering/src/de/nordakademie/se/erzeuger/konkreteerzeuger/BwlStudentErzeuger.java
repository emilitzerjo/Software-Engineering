package de.nordakademie.se.erzeuger.konkreteerzeuger;

import de.nordakademie.se.erzeuger.Erzeuger;
import de.nordakademie.se.studenten.konkretestudenten.BwlStudent;
import de.nordakademie.se.studenten.Student;

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
    protected Student erzeugeKonkretenStudent() {
        Scanner scanner = new Scanner(System.in);
        //Abfrage der besonderen Eigenschaft.
        System.out.println("Lieblingsgolfplatz eingeben:");
        String golfplatz = scanner.nextLine();

        return new BwlStudent(golfplatz);

    }


    @Override
    public String getStudiengang() {
        return "BWL";
    }

}
