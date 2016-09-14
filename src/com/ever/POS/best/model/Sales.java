package com.ever.POS.best.model;

import javafx.beans.property.*;

public class Sales extends Transaction{

	public Sales(IntegerProperty transactionNumber, StringProperty Date, DoubleProperty Amount){
		this.transactionNumber = transactionNumber;
		this.transactionDate = Date;
		this.transactionAmount = Amount;
	}

}
