package de.nordakademie.se;

import de.nordakademie.se.framework.Erzeuger;
import de.nordakademie.se.framework.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        super();
        this.erzeuger = erzeuger;
        this.studenten = new ArrayList<>();
    }


    /**
     * Erzeugung eines neuen Studenten. Es können alle Studentenarten erzeugt werden, für die ein konkreter Erzeuger existiert.
     */
    private void registriereNeuenStudent() {
        Scanner scanner = new Scanner(System.in);

        int type = -1;
        // so lange keine vorhandene Studentenart ausgewählt wird erfolgt die Abfrage
        while (type < 0 || type >= erzeuger.length) {

            //Alle vorhandenen Studentenarten werden ausgegeben
            for (int i = 0; i < erzeuger.length; i++) {
                System.out.println(i + ")" + erzeuger[i].getStudentenArt());
            }
            System.out.print("Wähle Studentenart aus:");
            type = scanner.nextInt();
        }
        //Ein Student wird mit dem ausgewählten Erzeuger erzeugt
        studenten.add(erzeuger[type].erstelleStudent());
    }

    /**
     * Alle Studenten werden auf der Konsole ausgegeben
     */
    private void zeigeAlleStudenten() {
        for (Student student : studenten) {
            System.out.println(student);
        }
    }

    /**
     * Start der Programmloop.
     */
    public void start() {
        int auswahl;
        System.out.println("Herzlich Willkommen zur Studentenverwaltung");
        do {
            //Ausgabe des Menüs
            System.out.println("0) Verlassen");
            System.out.println("1) neuen Student registrieren");
            System.out.println("2) alle Studenten anzeigen");
            Scanner scanner = new Scanner(System.in);

            //einlesen der gewählten Aktion
            auswahl = scanner.nextInt();

            //Auswahl zwischen den Menüpunkten
            switch (auswahl) {
                case 0: // 0 ist das Kommando für verlassen
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

            // 0 ist das Kommando für verlassen
        } while (auswahl != 0);
    }


}
