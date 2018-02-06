package com.dp.strategy;

public interface Fly {

	String fly();
}


class ItFlys implements Fly{

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "Flying High";
	}
	
	
	
}

class CantFlys implements Fly{

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "I cant fly High";
	}
	
	
	
}