package de.nordakademie.se;

import de.nordakademie.se.studenten.Student;
import de.nordakademie.se.studenten.konkretestudenten.AinfStudent;
import de.nordakademie.se.studenten.konkretestudenten.WingStudent;
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

    //Alle registrierten Studenten
    private List<Student> studenten;

    public Studentenverwaltung() {
        this.studenten = new ArrayList<>();
    }

    /**
     * Erzeugung eines neuen Studenten.
     */
    private void registriereNeuenStudent()  {
        int type = -1;
        //So lange keine vorhandene Studentenart ausgewählt wird, erfolgt die Abfrage
        while (type < 0 || type >= 2) {
            //Alle vorhandenen Studentenarten werden ausgegeben
            System.out.println("Wähle Studentenart aus:");
            System.out.println("0) angewandte Informatik");
            System.out.println("1) Wirtschaftsingenieurwesen");

            type = Konsole.readInt();
            System.out.println();
        }

        //Abfrage der nötigen allgemeinen Daten
        System.out.println("Bitte Name eingeben: ");
        String name = Konsole.readString();
        System.out.println("Bitte Jahrgang eingeben: ");
        int jahrgang = Konsole.readInt();
        Student student = null;

        //Unterscheidung der Studentenart
        if (type == 0) {

            //Abfrage der speziellen Eigenschaft eines Angewandten Informatikers
            System.out.println("Bitte Lieblingsprogrammiersprache eingeben");
            String programmiersprache = Konsole.readString();

            //Erstellung des Studenten
            student = new AinfStudent(programmiersprache);

        } else if (type == 1) {

            //Abfrage der speziellen Eigenschaft eines Wirtschaftsingenieurs
            System.out.println("Lieblingswerkzeug eingeben:");
            String lieblingswerkzeug = Konsole.readString();
            System.out.println("Praktikumsstunden eingeben:");
            int praktikumsstunden = Konsole.readInt();

            //Erstellung des Studenten
            student = new WingStudent(lieblingswerkzeug, praktikumsstunden);
        }

        //Setzen der allgemeinen Felder
        student.setName(name);
        student.setJahrgang(jahrgang);

        //Hinzufügen des Studenten in die Liste
        studenten.add(student);
    }

    /**
     * Alle Studenten werden auf der Konsole ausgegeben
     */
    private void zeigeAlleStudenten() {
        for (Student student : studenten) {

            //Funktion welche auf allen Studenten egal welcher Art aufgerufen wird
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
