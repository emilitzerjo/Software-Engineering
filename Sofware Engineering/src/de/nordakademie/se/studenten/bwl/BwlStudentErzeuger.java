package de.nordakademie.se.studenten.bwl;

import de.nordakademie.se.framework.Erzeuger;
import de.nordakademie.se.framework.Student;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

/**
 * @author Emil Militzer
 * <p>
 * Konkrete Implemtierung eines Erzeugers für BWL Studenten.
 */
public class BwlStudentErzeuger extends Erzeuger {

    private TextField golfplatzTextField = new TextField();

    @Override
    public String getStudiengang() {
        return "BWL";
    }

    @Override
    protected void fuegeKonkreteErfassungHinzu(GridPane grid) {
        golfplatzTextField.setPromptText("Golfplatz");

        grid.add(new Label("Golfplatz :"), 0, 2);
        grid.add(golfplatzTextField, 1, 2);
    }

    @Override
    protected Student erstelleStudent() {
        return new BwlStudent(golfplatzTextField.getText());
    }
}
