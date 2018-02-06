package com.dp.observer;

import java.util.ArrayList;

public class StockGrabber implements Subject {

	private ArrayList<Observer> observers;
	private double ibmPrice;
	private double applPrice;
	private double googlePrice;

	public StockGrabber() {

		observers = new ArrayList<Observer>();
	}

	@Override
	public void register(Observer newObserver) {

		observers.add(newObserver);

	}

	@Override
	public void unregister(Observer deleteObserver) {
		int observerIndex = observers.indexOf(deleteObserver);
		System.out.println("Observer " + (observerIndex + 1) + " deleted");
	}

	@Override
	public void notifyObserversss() {

		for (Observer observer : observers) {
			observer.update(googlePrice, applPrice, ibmPrice);
		}

	}

	public void setIBMPrice(double ibmPrice) {
		this.ibmPrice = ibmPrice;
		notifyObserversss();
	}

	public void setGooglePrice(double googlePrice) {
		this.googlePrice = googlePrice;
		notifyObserversss();
	}

	public void setAPPLPrice(double applPrice) {
		this.applPrice = applPrice;
		notifyObserversss();
	}
}
