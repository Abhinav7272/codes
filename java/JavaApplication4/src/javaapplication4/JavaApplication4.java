
package javaapplication4;
import java.awt.Button;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
//import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;


//import javafx.stage.Stage;

public class JavaApplication4 implements Initializable {
       int counter =0;
     @FXML
    private Label lab;

    @FXML
    private Button btn;

    @FXML
    void display(ActionEvent event) {
        counter++;
        lab.setText("button clicked :"+ counter);

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
}
