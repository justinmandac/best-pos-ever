package com.ever.POS.best.controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ever.POS.best.model.Product;

public class Database {
	static String fileName = "Inventory.csv";
	static List<Product> inventoryList = new ArrayList<>();

	public static void main(String args[]) throws FileNotFoundException {
		String line = null;
		FileReader content = new FileReader(fileName);
		Scanner entryReader = new Scanner(content);
		while (entryReader.hasNext()) {
			line = entryReader.nextLine();
			String token[] = line.split(",");
			inventoryList.add(new Product(Integer.parseInt(token[0]), token[1], token[2], token[3],
					Double.parseDouble(token[4]), Double.parseDouble(token[5]), Integer.parseInt(token[6])));
		}
		entryReader.close();
		System.out.println(inventoryList);
	}

	public static void DatabaseSaving(List<Product> inventoryList) throws FileNotFoundException {
		FileWriter file = null;
		try {
			file = new FileWriter(fileName);
		} catch (IOException e) {
		}
		PrintWriter fileSaver = new PrintWriter(file);
		for (Product product : inventoryList) {
			fileSaver.println(product.getProductId() + "," + product.getProductName() + ", " + product.getProductUnit()
					+ ", " + product.getProductDescription() + ", " + product.getPriceForPurchase() + ", "
					+ product.getPriceForSales() + ", " + product.getStockQuantity());
		}
		fileSaver.flush();
		System.out.println("Transactions successfully saved.");
	}

}
