package com.ever.POS.best.view;

import com.ever.POS.best.MainPOSApp;
import com.ever.POS.best.model.Product;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert.AlertType;

public class InventoryScreenController {
	static String addOrEdit;

	@FXML
	public TableView<Product> productsTable;

	@FXML
	private TableColumn<Product, Number> productID;

	@FXML
	private TableColumn<Product, String> productName;

	@FXML
	private TableColumn<Product, String> productUnit;

	@FXML
	private TableColumn<Product, String> productDescription;

//	@FXML
//	private TableColumn<Product, Number> purchasePrice;

	@FXML
	private TableColumn<Product, Number> retailPrice;

	@FXML
	private TableColumn<Product, Number> inStock;

	private MainPOSApp posApp;

	public InventoryScreenController() {

	}

	@FXML
	private void initialize() {

		productID.setCellValueFactory(cellData -> cellData.getValue().productIDProperty());
		productName.setCellValueFactory(cellData -> cellData.getValue().productNameProperty());
		//purchasePrice.setCellValueFactory(cellData -> cellData.getValue().priceForPurchaseProperty());
		productUnit.setCellValueFactory(cellData -> cellData.getValue().productUnitProperty());
		productDescription.setCellValueFactory(cellData -> cellData.getValue().productDescriptionProperty());
		retailPrice.setCellValueFactory(cellData -> cellData.getValue().priceForSalesProperty());
		inStock.setCellValueFactory(cellData -> cellData.getValue().stockQuantityProperty());

		//Clear product details.
        showProductDetails(null);

        // Listen for selection changes and show the product details when changed.
        //productsTable.getSelectionModel().selectedItemProperty().addListener(
               // (observable, oldValue, newValue) -> showProductDetails(newValue));
	}

	public void showProductDetails(Product product) {
/*        if (product != null) {
            // Fill the labels with info from the product object.
        	productID.setText(Integer.toString(product.getProductId()));
        	productName.setText(product.getProductName());


            //productID.setText(product.getProductId());
//            lastNameLabel.setText(product.getLastName());
//            streetLabel.setText(product.getStreet());
//            postalCodeLabel.setText(Integer.toString(product.getPostalCode()));
//            cityLabel.setText(product.getCity());
//            birthdayLabel.setText(DateUtil.format(product.getBirthday()));
        } else {
            // Product is null, remove all the text.
        	productID.setText("");
            productName.setText("");
//            lastNameLabel.setText("");
//            streetLabel.setText("");
//            postalCodeLabel.setText("");
//            cityLabel.setText("");
//            birthdayLabel.setText("");
        }*/
    }



	public void setMainApp(MainPOSApp mainApp) {
        this.posApp = mainApp;

        // Add observable list data to the table
        productsTable.setItems(mainApp.getAllProducts());
    }

	@FXML
	private void handleAddProduct(){
		addOrEdit = "ADD";
    	posApp.showProductAddDialog();
	}


	@FXML
    private void handleEditProduct() {
        Product selectedProduct = productsTable.getSelectionModel().getSelectedItem();
        if (selectedProduct != null) {
        	addOrEdit = "EDIT";
        	posApp.showProductEditDialog(selectedProduct);
//            boolean okClicked = posApp.showProductEditDialog(selectedProduct);
//            if (okClicked) {
//                showProductDetails(selectedProduct);
//            }

        } else {
            // Nothing selected.
            Alert alert = new Alert(AlertType.WARNING);
            alert.initOwner(posApp.getPrimaryStage());
            alert.setTitle("No Selection");
            alert.setHeaderText("No Product Selected");
            alert.setContentText("Please select a product in the table.");

            alert.showAndWait();
        }
    }


}
