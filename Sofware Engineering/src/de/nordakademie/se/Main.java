package de.nordakademie.se;

import de.nordakademie.se.erzeuger.AinfStudentErzeuger;
import de.nordakademie.se.erzeuger.BwlStudentErzeuger;
import de.nordakademie.se.erzeuger.WingStudentErzeuger;

/**
 * @author Emil Militzer
 * <p>
 * Startklasse der Anwendung
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        //Erzeugung einer neuen Studentenverwaltung mit allen Studentenarten
        Studentenverwaltung studentenverwaltung = new Studentenverwaltung(
                new AinfStudentErzeuger(),
                new BwlStudentErzeuger(),
                new WingStudentErzeuger()
        );
        //Start der Anwendung
        studentenverwaltung.start();
    }
}
