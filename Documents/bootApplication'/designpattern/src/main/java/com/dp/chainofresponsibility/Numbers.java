package com.dp.chainofresponsibility;

public class Numbers {

	private int number1;
	private int number2;
	private String calculateResult;

	public Numbers(int newNumber1, int newNumber2, String calcResult){
		number1=newNumber1;
		number2= newNumber2;
		calculateResult=calcResult;
	}
	
	public int getNumber1(){return number1;}
	
	public int getNumber2(){return number2;}
	
	public String getCalculateResult(){return calculateResult;}
	

}
