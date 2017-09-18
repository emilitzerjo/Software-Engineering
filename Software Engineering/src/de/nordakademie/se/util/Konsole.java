package de.nordakademie.se.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Paul Konopik
 *
 *
 * Hilfsklasse für das Einlesen von Strings und Zahlen aus der Konsole
 *
 * Irrelevant für das Pattern.
 */
public class Konsole {

    private static BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));

    /**
     * Liest einen String aus der Konsole ein.
     *
     * @return eingelesenen String
     */
    public static String readString(){
        try {
            return bufferReader.readLine();
        } catch (IOException e) {
            return "";
        }
    }

    /**
     * Liest einen int aus der Konsole ein.
     *
     * @return eingelesene int
     */
    public static int readInt(){
        int val = 0;
        boolean erfolgreich = false;
        while(!erfolgreich) {
            try {
                val =  Integer.valueOf(bufferReader.readLine().trim());
                erfolgreich = true;
            } catch (IOException | NumberFormatException e) {
                erfolgreich = false;
                System.out.println("Die Eingabe war keine Zahl, bitte erneut versuchen.");
            }
        }
        return val;
    }
}
