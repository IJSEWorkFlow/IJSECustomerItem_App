/*
 * ---------------------------------------------------------------------------------------------
 *   Copyright (c) 2021. Sanduni_Dhananjana Corporation. All rights reserved.
 *   Licensed under the MIT License. See License.txt in the project root for license information
 *  --------------------------------------------------------------------------------------------
 */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * @author SanduniDhananjana <sandunidhananjana00@gmail.com>
 * @Time :2:21 PM
 * @Date :2021-10-09/Oct
 * @Project Name :IjseCustomItem_App
 */
public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("lk/ijse/main/view/MainPage.fxml"))));

        primaryStage.setTitle("IJSE SAVE Customer Item Project");
        primaryStage.setResizable(false);
        primaryStage.centerOnScreen();

        primaryStage.show();
    }
}
