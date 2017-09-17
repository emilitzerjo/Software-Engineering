package de.nordakademie.se.studenten.wing;

import de.nordakademie.se.framework.Erzeuger;
import de.nordakademie.se.framework.Student;
import de.nordakademie.se.studenten.ainf.AinfStudent;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

import java.util.Scanner;

/**
 * @author Emil Militzer
 * <p>
 * Konkrete Implementierung für eine Wing-Student Erzeuger
 */
public class WingStudentErzeuger extends Erzeuger {


    @Override
    public String getStudiengang() {
        return "Wirtschaftsingenieurwesen";
    }

    @Override
    protected void fuegeKonkreteErfassungHinzu(Dialog dialog) {
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20, 150, 10, 10));

        TextField name = new TextField();
        name.setPromptText("Name");
        Spinner<Integer> jahrgangSpinner = new Spinner<>(2000, 2018, 2014, 1);
        TextField lieblingswerkzeug = new TextField();
        lieblingswerkzeug.setPromptText("Lieblingswekzeug");
        Spinner<Integer> praktikumsstunden = new Spinner<>(0,1000,0,1);

        grid.add(new Label("Name:"), 0, 0);
        grid.add(name, 1, 0);
        grid.add(new Label("Jahrgang:"), 0, 1);
        grid.add(jahrgangSpinner, 1, 1);

        grid.add(new Label("Lieblingswerkzeug :"), 0, 2);
        grid.add(lieblingswerkzeug, 1, 2);
        grid.add(new Label("Praktikumsstunden"),0,3);
        grid.add(praktikumsstunden,1,3);

        dialog.getDialogPane().setContent(grid);

        Platform.runLater(() -> name.requestFocus());

        dialog.setResultConverter(dialogButton -> {
            if (dialogButton == ButtonType.OK) {
                WingStudent wingStudent = new WingStudent(lieblingswerkzeug.getText(),praktikumsstunden.getValue());
                wingStudent.setName(name.getText());
                wingStudent.setJahrgang(jahrgangSpinner.getValue());
                return wingStudent;
            }
            return null;
        });
    }

}
