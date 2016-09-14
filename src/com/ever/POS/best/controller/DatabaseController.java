package com.ever.POS.best.controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ever.POS.best.model.Product;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DatabaseController {

	static String fileName = "Inventory.csv";
	//private static ObservableList<Product> inventoryList;

	public static List<Product> openInventoryDatabase() throws FileNotFoundException {
		List<Product> inventoryList = new ArrayList<Product>();
		String line = null;
		FileReader content = new FileReader(fileName);
		Scanner entryReader = new Scanner(content);
		while (entryReader.hasNext()) {
			line = entryReader.nextLine();
			String token[] = line.split(",");
			inventoryList.add(new Product(Integer.parseInt(token[0].trim()), token[1].trim(), token[2].trim(), token[3].trim(),
					Double.parseDouble(token[4].trim()), Double.parseDouble(token[5].trim()), Integer.parseInt(token[6].trim())));
		}
		entryReader.close();
		return inventoryList;
	}

	/*
	 * public static void DatabaseSaving(List <Product> inventoryList) throws
	 * FileNotFoundException { FileWriter file = null; try { file = new
	 * FileWriter(fileName); } catch (IOException e) { } PrintWriter fileSaver =
	 * new PrintWriter(file); for(Product product: inventoryList) {
	 * fileSaver.println(product.getProductId() + "," + product.getProductName()
	 * + ", " + product.getProductUnit() + ", " +
	 * product.getProductDescription() + ", " + product.getPriceForPurchase() +
	 * ", " + product.getPriceForSales() + ", " + product.getStockQuantity() );
	 * } fileSaver.flush();
	 * System.out.println("Transactions successfully saved."); }
	 */

}
