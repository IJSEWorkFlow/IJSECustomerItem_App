

package lk.ijse.main.controller;
/*
 * ---------------------------------------------------------------------------------------------
 *   Copyright (c) 2021. Sanduni_Dhananjana Corporation. All rights reserved.
 *   Licensed under the MIT License. See License.txt in the project root for license information
 *  --------------------------------------------------------------------------------------------
 */
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

/**
 * @author SanduniDhananjana <sandunidhananjana00@gmail.com>
 * @Time :2:21 PM
 * @Date :2021-10-09/Oct
 * @Project Name :IjseCustomItem_App
 */
public class MainController {
    public AnchorPane root;

    public void btnSaveCustomerOnAction(ActionEvent actionEvent) {
        Parent root=null;
        try {
            root = FXMLLoader.load(this.getClass().getResource("/lk/ijse/main/view/CustomerPage.fxml"));

        } catch (IOException e) {
            e.printStackTrace();
        }
        if(root!=null) {
            Scene scene = new Scene(root);
            Stage primaryStage = (Stage) this.root.getScene().getWindow();
            primaryStage.setScene(scene);
            primaryStage.centerOnScreen();
            TranslateTransition tt = new TranslateTransition(Duration.millis(500), scene.getRoot());
            tt.setFromX(-scene.getWidth());
            tt.setToX(0);
            tt.play();


        }

        }

    public void btnSaveItemOnAction(ActionEvent actionEvent) {
        Parent root=null;
        try {
            root = FXMLLoader.load(this.getClass().getResource("/lk/ijse/main/view//ItemPage.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(root!=null){
            Scene scene=new Scene(root);
            Stage primaryStage = (Stage) this.root.getScene().getWindow();
            primaryStage.setScene(scene);
            primaryStage.centerOnScreen();
            TranslateTransition tt = new TranslateTransition(Duration.millis(500), scene.getRoot());
            tt.setFromX(-scene.getWidth());
            tt.setToX(0);
            tt.play();



        }
}}
