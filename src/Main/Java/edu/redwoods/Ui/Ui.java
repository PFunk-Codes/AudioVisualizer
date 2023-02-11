package edu.redwoods.Ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.xml.namespace.QName;
import java.util.Objects;

public class Ui extends Application{

    @Override
    public void start(Stage window) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource( name: "Ui.fxml")));
        window.setTitle("Ui");
        window.setScene(new Scene(root));
        window.show();
    }
}
