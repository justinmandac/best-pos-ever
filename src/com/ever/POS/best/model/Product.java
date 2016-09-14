package com.ever.POS.best.model;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Product {

	private final IntegerProperty productId;
	private StringProperty productName;
	private StringProperty productUnit;
	private StringProperty productDescription;
	private DoubleProperty priceForPurchase;
	private DoubleProperty priceForSales;
	private IntegerProperty stockQuantity;

	public Product() {
		this(0, null, null, null, 0, 0, 0);
	}

	public Product(int productId, String productName, String productUnit, String productDescription,
			double priceForPurchase, double priceForSales, int stockQuantity) {
		this.productId = new SimpleIntegerProperty(productId);
		this.productName = new SimpleStringProperty(productName);
		this.productUnit = new SimpleStringProperty(productUnit);
		this.productDescription = new SimpleStringProperty(productDescription);
		this.priceForPurchase = new SimpleDoubleProperty(priceForPurchase);
		this.priceForSales = new SimpleDoubleProperty(priceForSales);
		this.stockQuantity = new SimpleIntegerProperty(stockQuantity);
	}

	public int getProductId() {
		return productId.get();
	}

	public void setProductId(int productId) {
		this.productId.set(productId);
	}

	public IntegerProperty productIDProperty() {
		return productId;
	}

	public String getProductName() {
		return productName.get();
	}

	public void setProductName(String productName) {
		this.productName.set(productName);
	}

	public StringProperty productNameProperty() {
		return productName;
	}

	public StringProperty productUnitProperty() {
		return productUnit;
	}

	public String getProductUnit() {
		return productUnit.get();
	}

	public void setProductUnit(String productUnit) {
		this.productUnit.set(productUnit);
	}

	public StringProperty productDescriptionProperty() {
		return productDescription;
	}

	public String getProductDescription() {
		return productDescription.get();
	}

	public void setProductDescription(String productDescription) {
		this.productDescription.set(productDescription);
	}

	public double getPriceForPurchase() {
		return priceForPurchase.get();
	}

	public void setPriceForPurchase(double priceForPurchase) {
		this.priceForPurchase.set(priceForPurchase);
	}

	public DoubleProperty priceForPurchaseProperty() {
		return priceForPurchase;
	}

	public double getPriceForSales() {
		return priceForSales.get();
	}

	public void setPriceForSales(double priceForSales) {
		this.priceForSales.set(priceForSales);
	}

	public DoubleProperty priceForSalesProperty() {
		return priceForSales;
	}

	public int getStockQuantity() {
		return stockQuantity.get();
	}

	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity.set(stockQuantity);
	}

	public IntegerProperty stockQuantityProperty() {
		return stockQuantity;
	}

	/*
	 * public void setProductPriceForSales(DoubleProperty productPriceForSales)
	 * { this.productPriceForSales = productPriceForSales; }
	 *
	 * public IntegerProperty getstockQuantity() { return stockQuantity; }
	 *
	 * public void setstockQuantity(IntegerProperty stockQuantity) {
	 * this.stockQuantity = stockQuantity; }
	 */

}
