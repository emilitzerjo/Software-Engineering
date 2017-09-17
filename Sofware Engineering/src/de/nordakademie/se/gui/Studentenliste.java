package de.nordakademie.se.gui;

import de.nordakademie.se.framework.Erzeuger;
import de.nordakademie.se.framework.Student;
import de.nordakademie.se.studenten.ainf.AinfStudentErzeuger;
import de.nordakademie.se.studenten.bwl.BwlStudentErzeuger;
import de.nordakademie.se.studenten.wing.WingStudentErzeuger;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.util.Callback;
import javafx.util.StringConverter;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.Optional;
import java.util.ResourceBundle;

public class Studentenliste implements Initializable {


    @FXML
    private Button registriereNeuenStudent;

    @FXML
    private ChoiceBox<Erzeuger> studiengangSpinner;

    @FXML
    private TableView<Student> studentenTable;

    @FXML
    private TableColumn<Student, String> studiengangColumn;
    @FXML
    private TableColumn<Student, String> nameColumn;
    @FXML
    private TableColumn<Student, String> jahrgangColumn;
    @FXML
    private TableColumn<Student, String> spezielleInfosColumn;

    private ObservableList<Student> listStudenten;
    private ObservableList<Erzeuger> listErzeuger;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initCols();
        listErzeuger = FXCollections.observableArrayList();
        studiengangSpinner.setItems(listErzeuger);
        studiengangSpinner.setConverter(new StringConverter<Erzeuger>() {
            @Override
            public String toString(Erzeuger object) {
                return object.getStudiengang();
            }

            @Override
            public Erzeuger fromString(String string) {
                return null;
            }
        });

        listStudenten = FXCollections.observableArrayList();
        studentenTable.setItems(listStudenten);


    }

    private void initCols() {
        studiengangColumn.setCellValueFactory(
                p -> new SimpleStringProperty(p.getValue().getStudiengang())
        );
        nameColumn.setCellValueFactory(
                p -> new SimpleStringProperty(p.getValue().getName())
        );
        jahrgangColumn.setCellValueFactory(
                p -> new SimpleStringProperty(p.getValue().getJahrgang() + "")
        );
        spezielleInfosColumn.setCellValueFactory(
                p -> new SimpleStringProperty(p.getValue().getSpezielleInfos())
        );
    }

    @FXML
    protected void erfasseNeuenStudent() throws IOException {
        Dialog dialog = studiengangSpinner.getValue().erstelleErfassungsdialog();
        Optional<Student> result = dialog.showAndWait();

        result.ifPresent(student -> {
            listStudenten.add(student);
        });
    }

    public void initErzeuger(Erzeuger... erzeuger) {
        listErzeuger.addAll(erzeuger);
        studiengangSpinner.getSelectionModel().select(0);
    }
}
