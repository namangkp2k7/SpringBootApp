package com.dp.observer;

import java.text.DecimalFormat;

public class GetTheStock implements Runnable {

	private int startTime;
	private String stock;
	private double price;

	private Subject stockGrabber;

	public GetTheStock(Subject stockGrabber, int newStartTime, String newStock, double newPrice) {
		// TODO Auto-generated constructor stub
		this.startTime = newStartTime;
		this.stockGrabber = stockGrabber;
		this.price = newPrice;
		this.stock = newStock;

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 20; i++) {
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			double randNum = (Math.random() * (0.06)) - .03;

			DecimalFormat df = new DecimalFormat("#.##");

			price = Double.valueOf(df.format((price + randNum)));

			if (stock == "IBM")
				((StockGrabber) stockGrabber).setIBMPrice(price);
			if (stock == "APPL")
				((StockGrabber) stockGrabber).setAPPLPrice(price);
			if (stock == "GOOG")
				((StockGrabber) stockGrabber).setGooglePrice(price);
			System.out.println(stock + " : " + df.format(price + randNum) + "" + df.format(randNum));
			System.out.println();
		}
	}

}
