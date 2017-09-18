package de.nordakademie.se.erzeuger.konkreteerzeuger;

import de.nordakademie.se.erzeuger.Erzeuger;
import de.nordakademie.se.studenten.Student;
import de.nordakademie.se.studenten.konkretestudenten.AinfStudent;
import de.nordakademie.se.util.Konsole;


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

        //Abfrage des besonderen Eigenschaft
        System.out.println("Programmiersprache(n) eingeben:");
        String programmiersprache = Konsole.readString();

        return new AinfStudent(programmiersprache);
    }


    @Override
    public String getStudiengang() {
        return "angewandte Informatik";
    }

}
