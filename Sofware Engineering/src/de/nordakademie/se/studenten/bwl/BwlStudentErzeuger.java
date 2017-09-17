package de.nordakademie.se.studenten.bwl;

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
 * Konkrete Implemtierung eines Erzeugers für BWL Studenten.
 */
public class BwlStudentErzeuger extends Erzeuger {


    @Override
    public String getStudiengang() {
        return "BWL";
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
        TextField golfplatz = new TextField();
        golfplatz.setPromptText("Golfplatz");

        grid.add(new Label("Name:"), 0, 0);
        grid.add(name, 1, 0);
        grid.add(new Label("Jahrgang:"), 0, 1);
        grid.add(jahrgangSpinner, 1, 1);

        grid.add(new Label("Golfplatz :"), 0, 2);
        grid.add(golfplatz, 1, 2);

        dialog.getDialogPane().setContent(grid);

        Platform.runLater(() -> name.requestFocus());

        dialog.setResultConverter(dialogButton -> {
            if (dialogButton == ButtonType.OK) {
                BwlStudent bwlStudent = new BwlStudent(golfplatz.getText());
                bwlStudent.setName(name.getText());
                bwlStudent.setJahrgang(jahrgangSpinner.getValue());
                return bwlStudent;
            }
            return null;
        });
    }
}
