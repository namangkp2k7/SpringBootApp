package com.dp.observer;

public class GrabStocks {
	public static void main(String[] args) {

		StockGrabber stockeGrabber = new StockGrabber();

		StockObserver observer1 = new StockObserver(stockeGrabber);

		stockeGrabber.setAPPLPrice(197.00);
		stockeGrabber.setGooglePrice(697.00);
		stockeGrabber.setIBMPrice(657.00);

		StockObserver observer2 = new StockObserver(stockeGrabber);

		stockeGrabber.setAPPLPrice(5.00);
		stockeGrabber.setGooglePrice(6.00);
		stockeGrabber.setIBMPrice(7.00);

		stockeGrabber.unregister(observer1);

		Runnable getIBM = new GetTheStock(stockeGrabber, 2, "IBM", 197.00);
		Runnable getAPPL = new GetTheStock(stockeGrabber, 2, "APPL", 677.00);
		Runnable getGOOG = new GetTheStock(stockeGrabber, 2, "GOOG", 697.00);

		new Thread(getIBM).start();
		new Thread(getAPPL).start();
		new Thread(getGOOG).start();

	}
}
