package de.nordakademie.se.framework;

import de.nordakademie.se.studenten.ainf.AinfStudent;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

import java.util.Scanner;

/**
 * @author Emil Militzer
 *
 * Oberklasse für alle Erzeuger. Gibt Methoden vor, welche von den Unterklassen implementiert werden müssen
 */
public abstract class Erzeuger {

    /**
     * Hier wird der Name des Studienganges zurückgegeben.
     *
     * @return Name des Studienganges
     */
    public abstract String getStudiengang();

    public Dialog erstelleErfassungsdialog(){
        Dialog<Student> dialog = new Dialog<>();
        dialog.setTitle("Registriere Student");
        dialog.setHeaderText("Erzeuge einen neuen "+getStudiengang()+" Studenten");

        dialog.getDialogPane().getButtonTypes().addAll(ButtonType.OK, ButtonType.CANCEL);

        fuegeKonkreteErfassungHinzu(dialog);
        return dialog;
    }

    protected abstract void fuegeKonkreteErfassungHinzu(Dialog dialog);


}
