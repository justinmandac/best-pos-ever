package com.ever.POS.best;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.ever.POS.best.model.Product;
import com.ever.POS.best.controller.*;
import com.ever.POS.best.view.AddEditProductScreenController;
import com.ever.POS.best.view.InventoryScreenController;
//import com.ever.POS.best.view.MainScreenController;


import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainPOSApp extends Application {
    private Stage primaryStage;
    private BorderPane rootLayout;


	private ObservableList<Product> product = FXCollections.observableArrayList();

	public MainPOSApp() throws FileNotFoundException {

		product = FXCollections.observableArrayList(DatabaseController.openInventoryDatabase());
	}

	@Override
	public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Best POS Ever!");

        initRootLayout();
        showInventoryScreen();
        //showMainScreen();
	}

    public void initRootLayout() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainPOSApp.class.getResource("view/RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


/*    public void showMainScreen() {
        try {
            // Load product overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainPOSApp.class.getResource("view/MainScreen.fxml"));
            AnchorPane mainScreen = (AnchorPane) loader.load();

            // Set product overview into the center of root layout.
            rootLayout.setCenter(mainScreen);

            // Give the controller access to the main app.
            MainScreenController controller = loader.getController();
            //controller.setMainApp(this);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/

    public void showInventoryScreen() {
        try {
            // Load product overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainPOSApp.class.getResource("view/InventoryScreen.fxml"));
            AnchorPane mainScreen = (AnchorPane) loader.load();

            // Set product overview into the center of root layout.
            rootLayout.setCenter(mainScreen);

            // Give the controller access to the main app.
            InventoryScreenController controller = loader.getController();
            controller.setMainApp(this);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


	public ObservableList<Product> getAllProducts(){
		return product;
	}

	public boolean showProductAddDialog(){
		try {
            // Load the fxml file and create a new stage for the popup dialog.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainPOSApp.class.getResource("view/AddEditProductScreen.fxml"));
            AnchorPane page = (AnchorPane) loader.load();

            // Create the dialog Stage.
            Stage dialogStage = new Stage();
            dialogStage.setTitle("Edit Product");
            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.initOwner(primaryStage);
            Scene scene = new Scene(page);
            dialogStage.setScene(scene);

            // Set the product into the controller.
            AddEditProductScreenController controller = loader.getController();
            controller.setDialogStage(dialogStage);

            // Show the dialog and wait until the user closes it
            dialogStage.showAndWait();

            return controller.isOkClicked();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
	}

    public boolean showProductEditDialog(Product product) {
        try {
            // Load the fxml file and create a new stage for the popup dialog.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainPOSApp.class.getResource("view/AddEditProductScreen.fxml"));
            AnchorPane page = (AnchorPane) loader.load();

            // Create the dialog Stage.
            Stage dialogStage = new Stage();
            dialogStage.setTitle("Edit Product");
            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.initOwner(primaryStage);
            Scene scene = new Scene(page);
            dialogStage.setScene(scene);

            // Set the product into the controller.
            AddEditProductScreenController controller = loader.getController();
            controller.setDialogStage(dialogStage);
            controller.setProduct(product);

            // Show the dialog and wait until the user closes it
            dialogStage.showAndWait();

            return controller.isOkClicked();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }

}
