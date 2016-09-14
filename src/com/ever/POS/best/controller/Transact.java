package com.ever.POS.best.controller;

//import com.ever.POS.best.model.*;

//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;

public class Transact {
	//private static ObservableList<Product> productList = Inventory.getAllProducts();
	//private static ObservableList<Transaction> transactions = FXCollections.observableArrayList();
	//private static int transpointer = 0;

	//To be replace with the complete transaction handle button on view
	/*public static ObservableList<Product> updateStock(ObservableList<Product> modifiedProducts,
			String transactionType) {

		Product finder = null;
		for (int i = 0; i < modifiedProducts.size(); i++) {
			finder = Inventory.searchProduct(productList, modifiedProducts.get(i).getProductId());
			if (finder != null) {
				if (transactionType.equalsIgnoreCase("PURCHASE"))
					productList.get(i)
							.setstockQuantity(finder.getstockQuantity() + modifiedProducts.get(i).getstockQuantity());
				else
					productList.get(i)
							.setstockQuantity(finder.getstockQuantity() - modifiedProducts.get(i).getstockQuantity());
			}
		}
		return productList;
	}*/

	//To be replaced with the complete transaction handle button on view
	/*public static void newTransaction(int transactionNumber, String transactionDate, double transactionAmount,
			String transactionType) {
		if (transactionType.equalsIgnoreCase("PURCHASE"))
			transactions.add(new Purchase(transactionNumber, transactionDate, transactionAmount));
		else
			transactions.add(new Sales(transactionNumber, transactionDate, transactionAmount));
	}*/


	//To be replace with the clicking on the Transactions on the Table list view
	/*public static Transaction searchTransaction(ObservableList<Transaction> transactions, int transactionNumber) {
		for (int i = 0; i < transactions.size(); i++) {
			if (transactions.get(i) != null && transactions.get(i).getTransactionNumber() == transactionNumber) {
				//transpointer = i;
				return transactions.get(i);
			}
		}
		return null;
	}
*/

	//No need to implement since the Table List shows all the transactions
	/*public static ObservableList<Transaction> viewAllTransactions(){
		return transactions;
	}*/

}
