package de.nordakademie.se;

import de.nordakademie.se.erzeuger.Erzeuger;
import de.nordakademie.se.studenten.Student;
import de.nordakademie.se.util.Konsole;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Emil Militzer
 * <p>
 * Anwendungsklasse Studentenverwaltung
 * <p>
 * Verwaltet alle Studenten und regelt die Erzeugung neuer Studenten.
 */
public class Studentenverwaltung {

    //Alle Erzeuger für die verschiedenen Studentenarten
    private Erzeuger[] erzeuger;

    //Alle registrierten Studenten
    private List<Student> studenten;

    public Studentenverwaltung(Erzeuger... erzeuger) {
        this.erzeuger = erzeuger;
        this.studenten = new ArrayList<>();
    }

    /**
     * Erzeugung eines neuen Studenten. Es können alle Studentenarten erzeugt werden, für die ein konkreter Erzeuger existiert.
     */
    private void registriereNeuenStudent() {
        int type = -1;
        //So lange keine vorhandene Studentenart ausgewählt wird, erfolgt die Abfrage
        while (type < 0 || type >= erzeuger.length) {

            System.out.println("Wähle Studentenart aus:");

            //Alle vorhandenen Studentenarten werden ausgegeben
            for (int i = 0; i < erzeuger.length; i++) {
                System.out.println(i + ")" + erzeuger[i].getStudiengang());
            }
            type = Konsole.readInt();
            System.out.println();
        }
        //Ein Student wird mit dem ausgewählten Erzeuger erzeugt
        studenten.add(erzeuger[type].erzeugeStudent());
    }

    /**
     * Alle Studenten werden auf der Konsole ausgegeben
     */
    private void zeigeAlleStudenten() {
        for (Student student : studenten) {

            //Funktion, welche auf allen Studenten egal welcher Art aufgerufen wird
            System.out.println(student.toString());
        }
    }

    /**
     * Start der Programmschleife.
     */
    public void start() {
        int auswahl;
        System.out.println("Herzlich Willkommen zur Studentenverwaltung");
        do {
            //Ausgabe des Menüs
            System.out.println("Bitte wählen Sie eine Aktion aus:");
            System.out.println("0) Verlassen");
            System.out.println("1) neuen Student registrieren");
            System.out.println("2) alle Studenten anzeigen");

            //Einlesen der gewählten Aktion
            auswahl = Konsole.readInt();
            System.out.println();

            //Auswahl zwischen den Menüpunkten
            switch (auswahl) {
                case 0: //0 ist das Kommando für Verlassen
                    break;
                case 1:
                    registriereNeuenStudent();
                    break;
                case 2:
                    zeigeAlleStudenten();
                    break;
                default:
                    System.out.println("Unbekannter Eingabewert! Bitte erneut versuchen!");
                    break;
            }
            System.out.println();

            //0 ist das Kommando für Verlassen
        } while (auswahl != 0);
    }
}
