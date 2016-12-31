/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplikasi;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Griya Salbini
 */
public class MainController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private Label lblStatus;
    
    @FXML
    private TextField txtUsername;
    
    @FXML
    private PasswordField txtPassword;
    
    public void Login (ActionEvent event) throws IOException{
        if (txtUsername.getText().equals("user") && txtPassword.getText().equals("pass")) {
            lblStatus.setText("Login berhasil");
            Stage primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("/Aplikasi/Main.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        } else {
            lblStatus.setText("Login gagal");
        }
    }
    
}
