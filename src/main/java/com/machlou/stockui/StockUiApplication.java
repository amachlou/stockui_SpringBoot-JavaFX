package com.machlou.stockui;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import javafx.application.Application;

@SpringBootApplication
public class StockUiApplication {

	public static void main(String[] args) {
		Application.launch(StockUi.class,args);
	}

}
