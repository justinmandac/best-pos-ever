package com.ever.POS.best.model;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

public class Purchase extends Transaction {

	public Purchase(IntegerProperty transactionNumber, StringProperty Date, DoubleProperty Amount){
		this.transactionNumber = transactionNumber;
		this.transactionDate = Date;
		this.transactionAmount = Amount;
	}

}
