package com.dp.strategy;

public class Animal {
	
	public Fly flyingType;

	public void fly(){
		System.out.println("I am flying");
	}
	
	public String tryToFly(){
		return flyingType.fly();
	}
	
	public void setFlyingAbility(Fly newFlyType){
		flyingType = newFlyType;
	}
	
}
