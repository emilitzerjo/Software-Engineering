package de.nordakademie.se;

import de.nordakademie.se.gui.Studentenliste;
import de.nordakademie.se.studenten.ainf.AinfStudentErzeuger;
import de.nordakademie.se.studenten.bwl.BwlStudentErzeuger;
import de.nordakademie.se.studenten.wing.WingStudentErzeuger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * @author Emil Militzer
 * <p>
 * Startklasse der Anwendung
 */
public class Main extends Application {

    private Label label;

    public static void main(String[] parameters) {
        launch(parameters);
    }

    @Override
    public void init() {
        label = new Label("Hello World");
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("gui/Studenteliste.fxml"));
        Parent root = fxmlLoader.load();


        Studentenliste controller = fxmlLoader.<Studentenliste>getController();
        controller.initErzeuger(new AinfStudentErzeuger(), new BwlStudentErzeuger(), new WingStudentErzeuger());
        Scene scene = new Scene(root);


        stage.setTitle("Studentenverwaltung");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop() {
    }
}
