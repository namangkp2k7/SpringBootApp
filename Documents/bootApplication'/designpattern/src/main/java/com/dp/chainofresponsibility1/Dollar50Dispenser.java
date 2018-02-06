package com.dp.chainofresponsibility1;

public class Dollar50Dispenser implements DispenseChain{
	
	private DispenseChain nextInChain;
	
	@Override
	public void setNextChain(DispenseChain nextChain) {
		// TODO Auto-generated method stub
		this.nextInChain=nextChain;
	}

	@Override
	public void dispense(Currency currency) {
		// TODO Auto-generated method stub
		if(currency.getAmount() >= 50){
			int num = currency.getAmount()/50;
			int remainder = currency.getAmount() % 50;
			System.out.println("Dispensing "+num+" 50$ note");
			if(remainder !=0) this.nextInChain.dispense(new Currency(remainder));
		}else{
			this.nextInChain.dispense(currency);
		}
	}

}
