package de.nordakademie.se.erzeuger.konkreteerzeuger;

import de.nordakademie.se.erzeuger.Erzeuger;
import de.nordakademie.se.studenten.Student;
import de.nordakademie.se.studenten.konkretestudenten.BwlStudent;
import de.nordakademie.se.util.Konsole;

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

        //Abfrage der besonderen Eigenschaft.
        System.out.println("Lieblingsgolfplatz eingeben:");
        String golfplatz = Konsole.readString();

        return new BwlStudent(golfplatz);

    }


    @Override
    public String getStudiengang() {
        return "BWL";
    }

}
