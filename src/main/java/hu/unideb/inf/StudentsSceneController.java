package hu.unideb.inf;

import hu.unideb.inf.model.Model;
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

    public Model model = new Model();

    public void setModel(Model model) {
        this.model = new Model();
    }

    /*private void refreshName(){
        nameLabel.setText(model.getStudent().getName());
    }*/

    @FXML
    void loadData(ActionEvent event) {
        //refreshName();
        nameLabel.textProperty().bind(model.getStudent().nameProperty());
        creditsLabel.setText(String.valueOf(model.getStudent().getCredits()));
        dateOfBirthLabel.setText(model.getStudent().getDateOfBirth().toString());
    }

    @FXML
    void changeData(ActionEvent event) {
        //nameLabel.setText("Tom Smith");
        model.getStudent().setName("Tom Smith");
        //refreshName();
    }
}
