package hu.unideb.inf;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class StudentsSceneController {

    @FXML
    private Label creditsLabel;

    @FXML
    private Label dateOfBirthLabel;

    @FXML
    private Label nameLabel;

    @FXML
    void loadData(ActionEvent event) {
        nameLabel.setText("Nagy Sándor");
        creditsLabel.setText("32");
        dateOfBirthLabel.setText("1982.01.05");
    }
}
