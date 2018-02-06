package com.dp.chainofresponsibility;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Chain chainCalc1 = new AddNumbers();
		Chain chainCalc2 = new Substract();
		Chain chainCalc3 = new Multiply();
		Chain chainCalc4 = new Divide();
		
		chainCalc1.setNextChain(chainCalc2);
		chainCalc2.setNextChain(chainCalc3);
		chainCalc3.setNextChain(chainCalc4);
		
		Numbers request = new Numbers(4, 2, "mul");
		chainCalc1.calculate(request);
	}

}
