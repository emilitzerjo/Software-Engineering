package de.nordakademie.se.studenten.ainf;

import de.nordakademie.se.framework.Erzeuger;
import de.nordakademie.se.framework.Student;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;


/**
 * @author Emil Militzer
 * <p>
 * Konkrete Implementierung eines Ainf-Studenten Erzeugers
 */
public class AinfStudentErzeuger extends Erzeuger {

       private TextField programmiersprache = new TextField();

    @Override
    public String getStudiengang() {
        return "angewandte Informatik";
    }

    @Override
    protected void fuegeKonkreteErfassungHinzu(GridPane grid) {
        programmiersprache.setPromptText("Programmiersprache");

        grid.add(new Label("Programmiersprache :"), 0, 2);
        grid.add(programmiersprache, 1, 2);
    }

    @Override
    protected Student erstelleStudent() {
        return new AinfStudent(programmiersprache.getText());
    }


}
