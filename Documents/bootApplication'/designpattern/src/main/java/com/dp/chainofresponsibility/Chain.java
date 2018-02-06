package com.dp.chainofresponsibility;

public interface Chain {
	
	void setNextChain(Chain chain);

	void calculate(Numbers request);
}
