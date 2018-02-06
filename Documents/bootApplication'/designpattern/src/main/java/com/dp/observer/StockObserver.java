package com.dp.observer;

public class StockObserver implements Observer {

	private double ibmPrice;
	private double applPrice;
	private double googlePrice;

	private static int observerIDTracker = 0;

	private int observerID;

	private Subject stockGrabber;

	public StockObserver(Subject stockGrabber) {
		// TODO Auto-generated constructor stub
		this.stockGrabber = stockGrabber;
		this.observerID = ++observerIDTracker;
		System.out.println("New Observer " + this.observerID);
		stockGrabber.register(this);
	}

	@Override
	public void update(double googlePrice, double applPrice, double ibmPrice) {
		// TODO Auto-generated method stub

		this.ibmPrice = ibmPrice;
		this.googlePrice = googlePrice;
		this.applPrice = applPrice;

		printThePrice();
	}

	private void printThePrice() {
		// TODO Auto-generated method stub
		System.out.println(observerID + " \n IBM " + ibmPrice + "\n Google " + googlePrice + "\nAppl " + applPrice);
		
	}

}
