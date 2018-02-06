package com.dp.chainofresponsibility1;

public class Dollar10Dispenser implements DispenseChain {

	
	private DispenseChain nextInChain;
	
	@Override
	public void setNextChain(DispenseChain nextChain) {
		// TODO Auto-generated method stub
		this.nextInChain=nextChain;
	}

	@Override
	public void dispense(Currency currency) {
		// TODO Auto-generated method stub
		if(currency.getAmount() >= 10){
			int num = currency.getAmount()/10;
			int remainder = currency.getAmount() % 10;
			System.out.println("Dispensing "+num+" 10$ note");
			if(remainder !=0) this.nextInChain.dispense(new Currency(remainder));
		}else{
			this.nextInChain.dispense(currency);
		}
	}



}
