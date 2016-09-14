package com.ever.POS.best.model;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public abstract class Transaction {
	protected IntegerProperty transactionNumber;
	protected StringProperty transactionDate;
	protected DoubleProperty transactionAmount;

	public Transaction(){

	}
	public Transaction(int transactionNumber, String transactionDate, double transactionAmount){
		this.transactionNumber = new SimpleIntegerProperty(transactionNumber);
		this.transactionDate = new SimpleStringProperty(transactionDate);
		this.transactionAmount = new SimpleDoubleProperty(transactionAmount);
	}

	public IntegerProperty getTransactionNumber() {
		return transactionNumber;
	}

	public StringProperty getTransactionDate() {
		return transactionDate;
	}

	public DoubleProperty getTransactionAmount() {
		return transactionAmount;
	}


}
