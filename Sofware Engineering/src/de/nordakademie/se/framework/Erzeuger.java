package de.nordakademie.se.framework;

import de.nordakademie.se.studenten.ainf.AinfStudent;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;

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

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20, 150, 10, 10));

        TextField name = new TextField();
        name.setPromptText("Name");
        Spinner<Integer> jahrgangSpinner = new Spinner<>(2000, 2018, 2014, 1);

        grid.add(new Label("Name:"), 0, 0);
        grid.add(name, 1, 0);
        grid.add(new Label("Jahrgang:"), 0, 1);
        grid.add(jahrgangSpinner, 1, 1);

        fuegeKonkreteErfassungHinzu(grid);

        dialog.getDialogPane().setContent(grid);

        Platform.runLater(name::requestFocus);


        dialog.setResultConverter(dialogButton -> {
            if (dialogButton == ButtonType.OK) {
                Student student = erstelleStudent();
                student.setName(name.getText());
                student.setJahrgang(jahrgangSpinner.getValue());
                return student;
            }
            return null;
        });

        return dialog;
    }

    protected abstract void fuegeKonkreteErfassungHinzu(GridPane dialog);

    protected abstract Student erstelleStudent();


}
