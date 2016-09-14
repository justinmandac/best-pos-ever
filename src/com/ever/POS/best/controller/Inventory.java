package com.ever.POS.best.controller;

import com.ever.POS.best.model.Product;

import javafx.collections.ObservableList;

public class Inventory {
	// private static int productPointer = 0;
	private static ObservableList<Product> productList;

	public static void addProduct(int productId, String productName, String productUnit, String productDescription,
			double productPriceForPurchase, double productPriceForSales, int stockQuantity) {
		productList.add(new Product(productId, productName, productUnit, productDescription, productPriceForPurchase,
				productPriceForSales, stockQuantity));
	}

	// To be replaced by Product Table List on view
	/*
	 * public static Product searchProduct(ObservableList<Product> product, int
	 * productId) { for (int i = 0; i < product.size(); i++) { if
	 * (product.get(i) != null && product.get(i).getProductId() == productId) {
	 * productPointer = i; return product.get(i); } } return null; }
	 */

	/*
	 * public static ObservableList<Product>
	 * deleteProduct(ObservableList<Product> product, int productId) { if
	 * (searchProduct(product, productId) != null) {
	 * product.remove(productPointer); } return product; }
	 */

	/*
	 * public static ObservableList<Product> editProduct(ObservableList<Product>
	 * product, int productId, String productName, double
	 * productPriceForPurchase, double productPriceForSales, int stockQuantity)
	 * { if (searchProduct(product, productId) != null) {
	 * product.get(productPointer).setProductName(productName);
	 * product.get(productPointer).setProductPriceForPurchase(
	 * productPriceForPurchase);
	 * product.get(productPointer).setProductPriceForSales(productPriceForSales)
	 * ; product.get(productPointer).setstockQuantity(stockQuantity); } return
	 * product; }
	 */

	public static ObservableList<Product> getAllProducts() {
		return productList;
	}

}
