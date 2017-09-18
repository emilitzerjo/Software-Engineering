package de.nordakademie.se;


import de.nordakademie.se.studenten.AinfStudent;
import de.nordakademie.se.studenten.Student;
import de.nordakademie.se.studenten.WingStudent;

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

    //Alle registrierten Studenten
    private List<Student> studenten;

    public Studentenverwaltung() {
        this.studenten = new ArrayList<>();
    }


    /**
     * Erzeugung eines neuen Studenten.
     */
    private void registriereNeuenStudent() {
        Scanner scanner = new Scanner(System.in);
        int type = -1;
        // so lange keine vorhandene Studentenart ausgewählt wird erfolgt die Abfrage
        while (type < 0 || type >= 2) {
            //Alle vorhandenen Studentenarten werden ausgegeben
            System.out.println("0) angewandte Informatik");
            System.out.println("1) Wirtschaftsingenieurwesen");

            System.out.print("Wähle Studentenart aus:");
            type = scanner.nextInt();
        }
        if (type == 0) {
            //Abfrage der nötigen Daten
            System.out.println("Bitte Name eingeben: ");
            String name = scanner.next();
            System.out.println("Bitte Jahrgang eingeben: ");
            int jahrgang = scanner.nextInt();
            System.out.println("Bitte Lieblingsprogrammiersprache eingeben");
            String programmiersprache = scanner.next();

            //Erstellung des Studenten
            AinfStudent ainfStudent = new AinfStudent(programmiersprache);
            ainfStudent.setName(name);
            ainfStudent.setJahrgang(jahrgang);

            //Hinzufügen des Studenten in die Liste
            studenten.add(ainfStudent);
        } else if (type == 1) {

            //Abfrage der nötigen Daten
            System.out.println("Bitte Name eingeben: ");
            String name = scanner.next();
            System.out.println("Bitte Jahrgang eingeben");
            int jahrgang = scanner.nextInt();
            System.out.println("Lieblingswerkzeug eingeben:");
            String lieblingswerkzeug = scanner.next();
            System.out.println("Praktikumsstunden eingeben:");
            int praktikumsstunden = scanner.nextInt();

            //Erstellung des Studenten
            WingStudent wingStudent = new WingStudent(lieblingswerkzeug, praktikumsstunden);
            wingStudent.setLieblingswerkzeug(lieblingswerkzeug);
            wingStudent.setPraktikumsstunden(praktikumsstunden);

            //Hinzufügen des Studenten in die Liste
            studenten.add(wingStudent);
        }
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
