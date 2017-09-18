package de.nordakademie.se;

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
        Studentenverwaltung studentenverwaltung = new Studentenverwaltung();
        //Start der Anwendung
        studentenverwaltung.start();
    }
}
