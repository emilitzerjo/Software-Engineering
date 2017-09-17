package de.nordakademie.se.studenten.wing;

import de.nordakademie.se.framework.Erzeuger;
import de.nordakademie.se.framework.Student;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 * @author Emil Militzer
 * <p>
 * Konkrete Implementierung für eine Wing-Student Erzeuger
 */
public class WingStudentErzeuger extends Erzeuger {

    private TextField lieblingswerkzeugTextField = new TextField();
    private Spinner<Integer> praktikumsstundenSpinner = new Spinner<>(0, 1000, 0, 1);

    @Override
    public String getStudiengang() {
        return "Wirtschaftsingenieurwesen";
    }

    @Override
    protected void fuegeKonkreteErfassungHinzu(GridPane grid) {
        lieblingswerkzeugTextField.setPromptText("Lieblingswerkzeug");

        grid.add(new Label("Lieblingswerkzeug :"), 0, 2);
        grid.add(lieblingswerkzeugTextField, 1, 2);

        grid.add(new Label("Praktikumsstunden :"), 0, 3);
        grid.add(praktikumsstundenSpinner, 1, 3);
    }

    @Override
    protected Student erstelleStudent() {
        return new WingStudent(lieblingswerkzeugTextField.getText(), praktikumsstundenSpinner.getValue());
    }
}
