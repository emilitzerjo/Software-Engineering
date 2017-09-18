package de.nordakademie.se.erzeuger.konkreteerzeuger;

import de.nordakademie.se.erzeuger.Erzeuger;
import de.nordakademie.se.studenten.Student;
import de.nordakademie.se.studenten.konkretestudenten.WingStudent;
import de.nordakademie.se.util.Konsole;


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

        //Abfrage von besonderen Eigenschaften
        System.out.println("Lieblingswerkzeug eingeben:");
        String lieblingswerkzeug = Konsole.readString();
        System.out.println("Praktikumsstunden eingeben:");
        int praktikumsstunden = Konsole.readInt();

        return new WingStudent(lieblingswerkzeug, praktikumsstunden);
    }


    @Override
    public String getStudiengang() {
        return "Wirtschaftsingenieurwesen";
    }

}
