package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import model.*;

public class friendController {

    @FXML
    ImageView Arjay, Jello, Carlo, lhara, Tenten; 

    @FXML
    Button tenBtn, jelBtn, raBtn, loBtn, jayBtn;

    lhara ra = new lhara();
    Carlo lo = new Carlo();
    Tenten ten = new Tenten();
    Arjay jay = new Arjay(); 
    jello jel = new jello(); 


    public void initialize() {

        ra.setRating("wow");
        ra.setTaste("Maganda");

        lo.setRating("sheesh");
        lo.setTaste("haha");

        ten.setRating("sheesh so");
        ten.setTaste("Pogi");

        jay.setRating("pogi");
        jay.setTaste("laki etits");

        jel.setRating("shish");
        jel.setTaste("Pogi");
      
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(tenBtn)) {
            alert.setContentText("Tenten " + ten.getRating() + " "+ ten.getTaste());
        }

        if (sourceButton == jelBtn) {
            alert.setContentText("Jello " + jel.getRating() + " and " + jel.getTaste());
        }

        if (sourceButton == raBtn) {
            alert.setContentText("Lhara " + ra.getRating() + " and " + ra.getTaste());
        }

        if (sourceButton == loBtn) {
            alert.setContentText("Carlo " + lo.getRating() + " and " + lo.getTaste());
        }


        alert.showAndWait();

    }

}
