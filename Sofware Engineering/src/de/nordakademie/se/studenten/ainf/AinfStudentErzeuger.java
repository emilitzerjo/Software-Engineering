package de.nordakademie.se.studenten.ainf;

import de.nordakademie.se.framework.Erzeuger;
import de.nordakademie.se.framework.Student;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.util.Pair;

import java.util.Optional;


/**
 * @author Emil Militzer
 * <p>
 * Konkrete Implementierung eines Ainf-Studenten Erzeugers
 */
public class AinfStudentErzeuger extends Erzeuger {


    @Override
    public String getStudiengang() {
        return "angewandte Informatik";
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
        TextField programmiersprache = new TextField();
        programmiersprache.setPromptText("Programmiersprache");

        grid.add(new Label("Name:"), 0, 0);
        grid.add(name, 1, 0);
        grid.add(new Label("Jahrgang:"), 0, 1);
        grid.add(jahrgangSpinner, 1, 1);

        grid.add(new Label("Programmiersprache :"), 0, 2);
        grid.add(programmiersprache, 1, 2);

        dialog.getDialogPane().setContent(grid);

        Platform.runLater(() -> name.requestFocus());

        dialog.setResultConverter(dialogButton -> {
            if (dialogButton == ButtonType.OK) {
                AinfStudent ainfStudent = new AinfStudent(programmiersprache.getText());
                ainfStudent.setName(name.getText());
                ainfStudent.setJahrgang(jahrgangSpinner.getValue());
                return ainfStudent;
            }
            return null;
        });
    }

}
